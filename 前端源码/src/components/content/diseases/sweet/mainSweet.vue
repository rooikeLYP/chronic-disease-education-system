<template>
  <div id="main-sweet">
    <nav-bar class="home-nav">
      <div slot="left" class="el-icon-arrow-left" @click="lastTick()"></div>
      <div slot="center">糖尿病健康指导</div>
    </nav-bar>
    <my-menu :menu-titles="menuTitles" :swipes="swipes" :menu-img="menuImgs" :path="path"></my-menu>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import myMenu from "@/components/content/showDisease/menu";

  export default {
    name: "mainSweet",
    components: {
      NavBar,
      myMenu,
    },
    data() {
      return {
        menuTitles: ['疾病知识指导', '糖尿病饮食指导', '糖尿病运动指导', '糖尿病病情监测', '糖尿病用药指导', '低血糖反应' ,'糖尿病足的预防及护理'],
        swipes: ["/disease/sweet/swipe/swipe_1.jpg", '/disease/sweet/swipe/swipe_2.jpg', '/disease/sweet/swipe/swipe_3.jpg'],
        // menuImgs: ['/disease/sweet/guide/guide.jpeg', '/disease/sweet/diet/title.jpeg', '/disease/sweet/sport/title.jpg', '/disease/sweet/monitor/title.png','/disease/sweet/medicine/title.jpeg', '/disease/sweet/low/title.jpg', '/disease/sweet/foot/title.jpg'],
        menuImgs: ['el-icon-s-order', 'el-icon-dessert', 'el-icon-bicycle', 'el-icon-folder-checked', 'el-icon-first-aid-kit', 'el-icon-paperclip', 'el-icon-suitcase'],
        path: ['/sweetKnowledge','/sweetDiet', '/sweetSport', '/sweetMonitor', '/sweetMedicine', '/sweetSugar', '/sweetFoot'],
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
  #main-sweet {
    height: 100%;
  }
  .my-menu {
    height: 100%;
    margin-top: 44px;
  }
  .my-swipe .van-swipe-item {
    color: #fff;
    font-size: 20px;
    line-height: 150px;
    text-align: center;
    background-color: #39a9ed;
  }
</style>