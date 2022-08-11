<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">预防知识指导</span>
    </nav-bar>
    <div class="main-body">
      <h2>疾病预防知识的指导</h2>
      <p class="text">学会自我调节，遇事心态平和，做到想得开、放得下；多与家人、朋友沟通，有利于缓解不良情绪；积极参加健康有益的文化活动，建立积极进取、开朗的生活态度。</p>
    </div>
    <video width="100%" height="40%" src="@/assets/video/heart/冠心病知识预防视频.mp4" controls></video>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "heartPrevent",
    components: {
      NavBar
    },
    methods: {
      lastTick() {
        this.$router.push('/heart')
      }
    }
  }
</script>

<style scoped>
  video {
    margin-top: 10%;
  }
</style>