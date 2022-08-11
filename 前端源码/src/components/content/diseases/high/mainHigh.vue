<template>
  <div id="main-high">
    <nav-bar class="home-nav">
      <div slot="left" class="el-icon-arrow-left" @click="lastTick()"></div>
      <div slot="center">高血压健康指导</div>
    </nav-bar>
    <my-menu :menu-titles="menuTitles" :swipes="swipes" :menu-img="menuImgs" :path="path"></my-menu>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import myMenu from "@/components/content/showDisease/menu"

  export default {
    name: "mainHigh",
    components: {
      NavBar,
      myMenu
    },
    data() {
      return {
        menuTitles: ['疾病知识指导', '疾病预防知识指导', '病情监测', '测血压视频', '运动指导', '用药指导' ,'饮食指导'],
        swipes: ["/disease/high/swipe/swipe_1.jpeg", '/disease/high/swipe/swipe_2.jpg', '/disease/high/swipe/swipe_3.webp'],
        // menuImgs: ['/disease/sweet/guide/guide.jpeg', '/disease/sweet/diet/title.jpeg', '/disease/sweet/sport/title.jpg', '/disease/sweet/monitor/title.png','/disease/sweet/medicine/title.jpeg', '/disease/sweet/low/title.jpg', '/disease/sweet/foot/title.jpg'],
        menuImgs: ['el-icon-s-order', 'el-icon-suitcase', 'el-icon-folder-checked', 'el-icon-video-play', 'el-icon-bicycle', 'el-icon-first-aid-kit', 'el-icon-dessert'],
        path: ['/highKnowledge', '/highPrevent', '/highMonitor', '/highVideo', '/highSport', '/highMedicine', '/highDiet']
      }
    },
    methods: {
      lastTick() {
        this.$router.push('/home')
      }
    }
  }
</script>

<style scoped>
  #main-high {
    height: 100%;
    display: flex;
    flex-direction: column;
    justify-content: space-around;
    font-family: 宋体;
  }
  .my-menu {
    height: 100%;
    margin-top: 44px;
  }
</style>