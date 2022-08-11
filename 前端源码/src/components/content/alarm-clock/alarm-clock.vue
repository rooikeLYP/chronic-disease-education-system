<template>
  <div id="alarm-clock">
    <nav-bar>
      <span slot="left" class="el-icon-arrow-left" @click="lastTick"></span>
      <div slot="center">吃药打卡</div>
    </nav-bar>
    <div class="main-clock">
      <el-button type="text" class="add-clock" @click="dialogVisible = true"><span class="el-icon-plus">新建打卡</span></el-button>
      <clock-item v-for="(item, index) in alarmClocks" :is-clock="item.是否打卡" class="clock-item" @itemClick="clockClick(item)">
        <h4 slot="title">{{item.名称}}({{ifClock(item)}})</h4>
        <span class="el-icon-alarm-clock" slot="icon"></span>
        <span slot="start-time">{{item.开始时间}}-</span>
        <span slot="end-time">{{item.结束时间}}</span>
        <span slot="status" class="status" :class="[clockStatus(item.打卡编号) !== '进行中' ? 'nStatus' : 'yStatus']">{{clockStatus(item.打卡编号)}}</span>
        <span slot="delete-icon" class="el-icon-delete" @click="deleteClock(item, index)"></span>
      </clock-item>
    </div>

    <el-dialog title="新建打卡" :visible.sync="dialogVisible" width="80%"  :modal-append-to-body=false z-index="10">
      <span class="clock-span">请输入打卡名称</span><br/>
      <el-input v-model="newClock" style="width: 90%"></el-input><br/>
      <div @click="popShow1 = true">
        <span class="clock-span">请输入开始时间</span><br/>
        <el-input v-model="clockStartTime" style="width: 90%"></el-input>
      </div>
      <div @click="popShow2 = true">
        <span class="clock-span">请输入结束时间</span><br/>
        <el-input v-model="clockEndTime" style="width: 90%"></el-input>
      </div>
      <span slot="footer" class="dialog-footer">
        <el-button type="primary" @click="addClock">确 定</el-button>
        <el-button @click="dialogVisible = false">取 消</el-button>
      </span>
    </el-dialog>

    <van-popup v-model="popShow1" position="bottom" :style="{height: '40%'}">
      <van-datetime-picker type="time" v-model="clockStartTime"></van-datetime-picker>
    </van-popup>
    <van-popup v-model="popShow2" position="bottom" :style="{height: '40%'}">
      <van-datetime-picker type="time" v-model="clockEndTime"></van-datetime-picker>
    </van-popup>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import mainTabber from '@/components/content/mainTabber/main-tabber'
  import clockItem from './clock-item'

  import {dealDate, isTomorrow} from "@/function/dealDate/dealDate";
  import {request} from "@/network/request";

  import 'vant/lib/index.css'

  export default {
    name: "alarm-clock",
    components: {
      clockItem,
      NavBar,
      mainTabber
    },
    data() {
      return {
        // 存储请求来的打卡相关的数据
        alarmClocks: {
          type: Array
        },
        // 控制dialog的显示
        dialogVisible: false,
        // 新打卡的名称
        newClock: '',
        // 新打卡的开始时间
        clockStartTime: '',
        // 新打卡的结束时间
        clockEndTime: '',
        // 弹出层1(选择开始时间)
        popShow1: false,
        // 弹出层2(选择结束时间)
        popShow2: false,
        // 存储在本地的打卡列表，用于更新打卡状态
        timeList: {
          type: Map
        },
        // 时间选择器的小时选项
        hourOptions: [],
        // 时间选择器的分钟选项
        minuteOptions: []
      }
    },
    methods: {
      // 返回上一级
      lastTick() {
        this.$router.push('/tools')
      },
      // 返回打卡的开始时间
      startTime(item) {
        let arr = item.开始时间.split(':');
        let sTime = new Date();
        sTime.setHours(arr[0]);
        sTime.setMinutes(arr[1]);
        return sTime;
      },
      // 返回打卡的结束时间
      endTime(item) {
        let arr = item.结束时间.split(':');
        let sTime = new Date();
        sTime.setHours(arr[0]);
        sTime.setMinutes(arr[1]);
        return sTime;
      },
      // 将打卡相关的数据保存起来
      saveTime(item) {
        let timeObj = {};
        let sTime
        if(item.上次打卡时间 === null)
         sTime = '';
        else sTime = item.上次打卡时间;
        timeObj.开始时间 = dealDate(this.startTime(item));
        timeObj.结束时间 = dealDate(this.endTime(item));
        timeObj.账号 = window.atob(this.$store.state.account)
        if(sTime !== '' && isTomorrow(sTime))
          timeObj.是否打卡 = 0;
        else timeObj.是否打卡 = item.是否打卡;
        // 将时间对象存储
        this.timeList.set(item.打卡编号, timeObj);
      },
      // 判断是否已经打卡
      ifClock(item) {
        if(item.是否打卡 === '1') return '已打卡';
        else return '未打卡';
      },
      // 经过一天之后初始化打卡状态
      initClock() {
        this.alarmClocks.forEach(item => {
          this.saveTime(item);
        })
      },
      // 根据时间判断是否可以打卡
      clockStatus(index) {
        let date = dealDate(new Date());
        let sTime = this.timeList.get(index).开始时间;
        let eTime = this.timeList.get(index).结束时间;
        if(date > sTime && date < eTime) return '进行中';
        else if(date < sTime) return '未开始';
        else return '已结束';
      },
      // 点击打卡
      clockClick(item) {
        if(this.clockStatus(item.打卡编号) === '未开始') {
          this.$message({
            type: 'info',
            message: '未到打卡时间',
          })
        }
        else if(this.clockStatus(item.打卡编号) === '已结束') {
          this.$message({
            type: 'error',
            message: '打卡时间已过',
          })
        }
        else if(this.clockStatus(item.打卡编号) === '进行中' && item.是否打卡 === '0') {
          item.是否打卡 = '1';
          let lastTime = dealDate(new Date())
          request({
            url: '/clock/updateClock',
            method: 'post',
            data: {
              num: item.打卡编号,
              lastTime,
              isClock: '1'
            }
          }).then(res => {
            if(res.data === true) {
              this.$message({
                type: 'success',
                message: '打卡成功'
              })
            }
          })
        }
        else {
          this.$message({
            type: 'info',
            message: '已完成打卡'
          })
        }
      },
      // 新建打卡
      addClock() {
        if(this.clockStartTime === '') {
          this.$message({
            type: "warning",
            message: '开始时间不能为空',
          })
        }else if(this.clockEndTime === '' ){
          this.$message({
            type: "warning",
            message: '结束时间不能为空',
          })
        }else if(this.newClock === '') {
          this.$message({
            type: "warning",
            message: '打卡名称不能为空',
          })
        }else{
          if(this.clockStartTime > this.clockEndTime ) {
            this.$message({
              type: "warning",
              message: '开始时间不能大于结束时间',
            })
          } else {
            request({
              url: '/clock/addClock',
              method: 'post',
              data: {
                account: window.atob(this.$store.state.account),
                name: this.newClock,
                startTime: this.clockStartTime,
                endTime: this.clockEndTime
              }
            }).then(res => {
              if(res.data) {
                this.$message({
                  type: 'success',
                  message: '新建成功!',
                })
                this.getClocks()
              } else {
                this.$message({
                  type: 'error',
                  message: '新建失败'
                })
              }
              this.dialogVisible = false;
            })
          }
        }
      },
      // 删除打卡
      deleteClock(item,index) {
        event.stopPropagation();
        this.$confirm('是否删除该打卡','警告',{
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          request({
            url: '/clock/deleteClock',
            method: 'post',
            data: {
              num: item.打卡编号
            }
          }).then(res => {
            if(res.data === true) {
              this.$message({
                type: 'success',
                message: '删除成功！'
              })
              this.alarmClocks.splice(index,1);
            }
          })
        }).catch(() => {
          this.$message({
            type: 'info',
            message: '已取消删除'
          });
        })

      },
      // 初始化时间选项
      initOptions() {
        for(let i = 0;i<24;i++) {
          let obj = {};
          if(i < 10){
            obj.value = '0' + i;
            obj.label = '0' + i;
          }else {
            obj.value = i;
            obj.label = i;
          }
          this.hourOptions.push(obj)
        }
        for(let i = 0;i<60;i++) {
          let obj = {};
          if(i < 10){
            obj.value = '0' + i;
            obj.label = '0' + i;
          }else {
            obj.value = i;
            obj.label = i;
          }
          this.minuteOptions.push(obj)
        }
      },
      // 发送通知
      notify(item) {
        if(item.是否打卡 === '0' && this.clockStatus(item.打卡编号) === '进行中'){
          this.$notify.info({
            title: '打卡提醒',
            message: item.名称 + '的时间到了',
            duration: 0
          });
        }
      },
      getClocks() {
        request({
          url: '/clock/getClocks',
          method: 'post',
          data: {
            account: window.atob(this.$store.state.account)
          }
        }).then(res => {
          this.alarmClocks = res.data
          this.timeList = new Map();
          this.initOptions();
          if(this.alarmClocks.length !== 0){
            this.initClock()
            // 设置一个循环的定时器来进行打卡状态的更新
            let task;
            if(task)
              clearInterval(task);
            task = setInterval(() => {
              this.alarmClocks.forEach((item, index) => {
                this.clockStatus(item.打卡编号)
                this.notify(item, index)
              })
            }, 600000)
          }
        })
      }
    },
    created() {
      this.getClocks();
    }
  }
</script>

<style scoped>
  #alarm-clock {
    height: 100vh;
  }
  .main-clock {
    margin-top: 44px;
  }
  .clock-item h4, span{
    position: relative;
    top: 20px;
    left: 10px;
  }
  .clock-item{
    position: relative;
  }
  .status {
    position: absolute;
    top: 60%;
    left: 80%;
    color: white;
    padding: 5px;
  }
  .nStatus {
    background: rgba(100,100,100,1);
  }
  .yStatus {
    background: limegreen;
  }
  .el-icon-arrow-left {
    position: relative;
    top: -1px;
    left: -5px;
  }
  .add-clock {
    width: 92%;
    display: inline-block;
    margin: 3%;
    border: 1px solid cornflowerblue;
  }
  .el-icon-plus {
    position: static;
  }
  .el-dialog-span {
    position: static;
    font-size: 18px;
  }
  .el-icon-delete {
    position: absolute;
    left: 90%;
    top: 10%;
    font-size: 30px;
  }
  .clock-span {
    position: static;
    font-size: 18px;
  }
  .dialog-footer {
    display: inline-block;
    margin-bottom: 20%;
    margin-right: 25%;
  }
</style>