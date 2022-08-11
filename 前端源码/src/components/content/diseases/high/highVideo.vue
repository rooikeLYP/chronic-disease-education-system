<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">测血压视频</span>
    </nav-bar>
    <div class="main-body">
      <h2>家庭测量血压方法</h2>
      <video width="100%" height="40%" src="@/assets/video/high/家庭测量血压方法.mp4" controls></video>
    </div>
    <div class="main-body">
      <h2>水银血压计测量方法</h2>
      <video width="100%" height="40%" src="@/assets/video/high/水银血压计测量方法.mp4" controls></video>
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  export default {
    name: "highVideo",
    components: {
      NavBar
    },
    methods: {
      lastTick() {
        this.$router.push('/high')
      }
    }
  }
</script>

<style scoped>

</style>