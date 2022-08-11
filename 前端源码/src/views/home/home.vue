<template>
  <div id="home">
    <nav-bar class="home-nav"><div slot="center">首页</div></nav-bar>
    <div class="disease">
      <show-disease path="/lung" class="show-disease">
        <img slot="disease-img" src="@/assets/img/disease/lung/title/title.jpg" alt="">
        <span slot="disease-name" class="disease-name">慢性阻塞性肺疾病健康指导</span>
      </show-disease>
      <show-disease path="/high" class="show-disease">
        <img slot="disease-img" src="@/assets/img/disease/high/title/title.jpeg" alt="">
        <span slot="disease-name" class="disease-name">高血压健康指导</span>
      </show-disease>
      <show-disease path="/sweet" class="show-disease">
        <img slot="disease-img" src="@/assets/img/disease/sweet/title/title.jpeg" alt="">
        <span slot="disease-name" class="disease-name">糖尿病健康指导</span>
      </show-disease>
      <show-disease path="/heart" class="show-disease">
        <img slot="disease-img" src="@/assets/img/disease/heart/title/title.jpg" alt="">
        <span slot="disease-name" class="disease-name">冠心病健康指导</span>
      </show-disease>
    </div>
    <main-tabber></main-tabber>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import mainTabber from '@/components/content/mainTabber/main-tabber'
  import ShowDisease from "@/components/content/showDisease/show-disease";

  export default {
    name: "home",
    data() {
      return {

      }
    },
    methods: {
    },
    components: {
      ShowDisease,
      NavBar,
      mainTabber
    }
  }
</script>

<style scoped>
  #home {
    /*padding-top: 44px;*/
    height: 100vh;
    margin-top: 44px;
    margin-bottom: 10px;
  }
  .home-nav {
    color: white;
    position: fixed;
    left: 0;
    right: 0;
    top: 0;
    z-index: 9;
  }
  .disease {
    display: flex;
    flex-wrap: wrap;
    flex-direction: row;
    justify-content: space-around;
    align-content: space-around;
    padding: 3px;
    overflow: scroll;
    margin-top: 44px;
  }
  img {
    width: 100%;
    height: 90%;
    border-bottom: 1px solid silver;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;

  }
  .disease-name {
    float: left;
    color: rgba(100,100,100,1);
    margin-top: 5%;
    margin-left: 7%;
  }
  .show-disease {
    margin-top: 5%;
  }
</style>