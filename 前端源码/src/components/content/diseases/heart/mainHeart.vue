<template>
  <div id="main-heart">
    <nav-bar class="home-nav">
      <div slot="left" class="el-icon-arrow-left" @click="lastTick()"></div>
      <div slot="center">冠心病健康指导</div>
    </nav-bar>
    <my-menu :menu-titles="menuTitles" :swipes="swipes" :menu-img="menuImgs" :path="path"></my-menu>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import myMenu from "@/components/content/showDisease/menu";

  export default {
    name: "mainHeart",
    components: {
      NavBar,
      myMenu
    },
    data() {
      return {
        menuTitles: ['疾病知识指导', '疾病预防知识指导', '运动指导', '饮食知识指导', '用药指导' ,'心前区疼痛处理方法'],
        swipes: ["/disease/heart/swipe/swipe_1.jpeg", '/disease/heart/swipe/swipe_2.jpg', '/disease/heart/swipe/swipe_3.jpg'],
        // menuImgs: ['/disease/sweet/guide/guide.jpeg', '/disease/sweet/diet/title.jpeg', '/disease/sweet/sport/title.jpg', '/disease/sweet/monitor/title.png','/disease/sweet/medicine/title.jpeg', '/disease/sweet/low/title.jpg', '/disease/sweet/foot/title.jpg'],
        menuImgs: ['el-icon-s-order', 'el-icon-suitcase', 'el-icon-bicycle', 'el-icon-dessert', 'el-icon-first-aid-kit', 'el-icon-video-play',  'el-icon-dessert'],
        path: ['/heartKnowledge', '/heartPrevent', '/heartSport', '/heartDiet', '/heartMedicine', '/heartHandle']
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
  #main-heart {
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