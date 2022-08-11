<template>
  <div id="self-introduce">
    <nav-bar>
      <div slot="left" class="el-icon-arrow-left" @click="lastTick()"></div>
      <div slot="center">自我介绍</div>
    </nav-bar>

    <div id="self-introduces">
    </div>
    <div class="footer"  @click="popShow = true">
      <div class="button">
        更新自我介绍
      </div>
    </div>

    <van-popup class="van-popup" v-model="popShow" position="bottom" :style="{height: '30%'}">
      <el-button @click="myrecording" style="margin-left: 1rem">{{
        time
        }}</el-button>
      <el-button @click="startPlay" style="margin-left: 1rem">{{
        playing ? "播放" : "暂停"
        }}</el-button>
      <el-button @click="delvioce" style="margin-left: 1rem">删除</el-button>
      <el-button @click="saveVoice" style="margin-left: 1rem">保存</el-button>
      <audio
              v-if="fileurl"
              :src="fileurl"
              controls="controls"
              style="display: none"
              ref="audio"
              id="myaudio"
      ></audio>
    </van-popup>
  </div>
</template>
<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import 'vant/lib/index.css'
  // 引入recorder.js
  import recording from "@/function/recorder.js";
  import {request} from "@/network/request";

  export default {
    data() {
      return {
        RecordingSwitch: true, //录音开关
        files: "", //语音文件
        num: 0, // 按住说话时间
        recorder: null,
        fileurl: "", //语音URL
        interval: "", //定时器
        time: "点击说话(0秒)",
        playing: true,
        voice: '',
        selfIntroduces: [],
        popShow: false,
        rec: null
      };
    },
    components: {
      NavBar
    },
    methods: {
      // 获取语音文件
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
      lastTick(){
        this.$router.push('/tools');
      },
      blobToDataURI(blob, callback) {
        let reader = new FileReader();
        reader.onload = function (e) {
          callback(e.target.result);
        }
        reader.readAsDataURL(blob);
      },
      // 点击录制
      myrecording() {
        if (this.files === "") {
          if (this.RecordingSwitch) {
            this.Start();
          } else {
            this.End();
          }
        } else if (this.time === "点击重录(0秒)") {
          this.files = "";
          this.Start();
        }
        this.RecordingSwitch = !this.RecordingSwitch;
      },
      // 点击播放
      startPlay() {
        if (this.playing) {
          this.$refs.audio.play();
        } else {
          this.$refs.audio.pause();
        }
        this.playing = !this.playing;
      },
      // 删除语音
      delvioce() {
        this.fileurl = "";
        this.files = "";
        this.num = 0;
        this.time = "点击说话(0秒)";
        this.$message({
          type: "success",
          message: '删除成功'
        })
      },
      // 保存语音
      saveVoice() {
        if(this.voice !== '') {
          request({
            url: '/introduce/addIntroduce',
            method: 'post',
            data: {
              account: window.atob(this.$store.state.account),
              name: '',
              introduce: this.voice,
              isDefault: '0'
            }
          }).then(res => {
            if(res.data === true) {
              this.$message({
                type: 'success',
                message: '添加成功'
              })
              this.popShow = false;
            }
            let container = document.querySelector("#self-introduces")
            container.innerHTML = "";
            this.getIntroduce();
          })
        }
        else {
          this.$message({
            type: 'error',
            message: '请录入语音'
          })
        }
      },
      // 清除定时器
      clearTimer() {
        if (this.interval) {
          this.num = 0;
          clearInterval(this.interval);
        }
      },
      // 开始录制
      Start() {
        this.clearTimer();
        recording.get((rec) => {
          // 当首次按下时，要获取浏览器的麦克风权限，所以这时要做一个判断处理
          if (rec) {
            this.recorder = rec;
            this.interval = setInterval(() => {
              if (this.num >= 60) {
                this.recorder.stop();
                this.num = 0;
                this.End();
              } else {
                this.time = "点击结束（" + this.num + "秒）";
                this.recorder.start();
                this.num++;
              }
            }, 1000);
          }
        });
      },
      // 停止录制
      End() {
        this.clearTimer();
        if (this.recorder) {
          this.recorder.stop(); // 重置说话时间
          this.num = 60;
          this.time = "点击重录(0秒)"; // 获取语音二进制文件
          let bold = this.recorder.getBlob(); // 将获取的二进制对象转为二进制文件流
          let files = new File([bold], "test.mp3", {
            type: "audio/mp3",
            lastModified: Date.now(),
          });
          this.files = files;
          this.blobToDataURI(bold, res => {
            this.voice = res;
          })
          //获取音频时长
          let fileurl = URL.createObjectURL(files);
          this.fileurl = fileurl;
          let audioElement = new Audio(fileurl);
          let duration;
          audioElement.addEventListener("loadedmetadata", function (_event) {
            duration = audioElement.duration;
            console.log("视频时长:" + duration);
          });
        }
      },
    },
    created() {
      this.getIntroduce();
    }
  };
</script>

<style scoped>
  #self-introduce {
    height: 100%;
  }
  #self-introduces {
    /*background: white;*/
    height: 20%;
    margin-top: 50px;
  }
  .introduce-item {
    position: relative;
    width: 100%;
    border-bottom: 1px solid rgba(100,100,100,0.1);
    /*border-radius: 50px;*/
  }
  .footer {
    position: fixed;
    bottom: 0;
    width: 100%;
    height: 10%;
  }
  .button {
    width: 90%;
    height: 70%;
    border: 1px solid dodgerblue;
    border-radius: 30px;
    position: relative;
    left: 5%;
    top: 15%;
    text-align: center;
    line-height: 40px;
    font-weight: lighter;
    color: dodgerblue;
  }
  .phone {
    width: 100px;
    height: 100px;
    position: relative;
    left: 35%;
    top: 40px;
    text-align: center;
    font-size: 50px;
    color: white;
    background: limegreen;
    border-radius: 50px;
  }
  .el-icon-microphone {
    position: relative;
    top: 17%;
  }
  .text {
    position: absolute;
    top: 70%;
    left: 32%;
    font-family: 宋体;
  }
  .van-popup {
    padding-top: 20px;
  }
</style>
