<template>
  <div id="tools-bar">
    <div class="main-tools">
      <h3>日常管理</h3>
      <tools-item class="tools-item" path="/alarm-clock">
        <span slot="tools-icon" class="el-icon-alarm-clock"></span>
        <span slot="tools-text">吃药打卡</span>
      </tools-item>
    </div>
    <div class="main-tools">
      <h3>紧急工具</h3>
      <tools-item class="tools-item" path="/selfIntroduce" @touchstart="gtouchstart()" @touchend="gtouchend()" @touchmove="gtouchmove()">
        <span slot="tools-icon" class="el-icon-microphone"></span>
        <span slot="tools-text">自我介绍</span>
      </tools-item>
      <tools-item class="tools-item" path="/telephone">
        <span slot="tools-icon" class="el-icon-phone"></span>
        <span slot="tools-text">紧急联系人</span>
      </tools-item>
    </div>
    <div id="self-introduces" style="display: none"></div>
  </div>
</template>

<script>
  import ToolsItem from "@/components/content/toolsBar/tools-item";
  import {request} from "@/network/request";

  export default {
    name: "tools-bar",
    components: {
      ToolsItem
    },
    data() {
      return {
        selfIntroduces: [],
        timeOutEvent:0,
        longclick:false,
      }
    },
    methods: {
      getIntroduce() {
        request({
          url: '/introduce/getIntroduce',
          method: 'post',
          data: {
            account: window.atob(this.$store.state.account)
          }
        }).then(res => {
          this.selfIntroduces = res.data;
        }).then(() => {
          let container = document.querySelector("#self-introduces")
          let audio = document.createElement('audio');
          this.selfIntroduces.forEach(item => {
            audio.src = item.自我介绍;
            audio.controls = true;
            container.appendChild(audio);
          })
        })
      },
      //开始按
      gtouchstart(){
        this.longclick=false
        clearTimeout(this.timeOutEvent);
        this.timeOutEvent=setTimeout(() => {
          this.longclick=true
        }, 5000);//自定义长按时间，然后触发事件
      },
      gtouchmove(){
        clearTimeout(this.timeOutEvent);
        this.timeOutEvent=0;
      },
      //手释放，如果在500毫秒内就释放，则取消长按事件，此时可以执行onclick应该执行的事件
      gtouchend(){
        clearTimeout(this.timeOutEvent);//清除定时器
        console.log('结束了')
        if(this.timeOutEvent !== 0 && this.longclick === true){
          let audio = document.querySelector('audio');
          audio.play();
        }
      },

    },
    created() {
      this.getIntroduce();
    }
  }
</script>

<style scoped>
  .main-tools {
    height: 150px;
    background: white;
    border-radius: 5px;
    width: 96%;
    margin: 2% ;
  }
  .tools-item {
    text-align: center;
  }
  h3 {
    position: relative;
    left: 10px;
    top: 10px;
  }
  .el-icon-phone,.el-icon-alarm-clock,.el-icon-microphone {
    font-size: 40px;
    font-weight: bold;
    margin: 10px 10px 10px 10px;
    padding: 10px;
    border-radius: 20px;
    color: white;
  }
  .el-icon-microphone {
    background: mediumturquoise;
  }
  .el-icon-alarm-clock {
    background: orange;
  }
  .el-icon-phone {
    background: lightsalmon;
  }
</style>