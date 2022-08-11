<template>
  <div class="my-menu">
    <div class="menu-img">
      <van-swipe class="my-swipe" :autoplay="3000" indicator-color="white">
        <van-swipe-item v-for="item in swipes">
          <img :src="require('@/assets/img' + item)" alt="">
        </van-swipe-item>
      </van-swipe>
    </div>
   <div class="menu-body" v-for="(item, index) in menuTitles" @click="itemClick(index)">
     <span :class="menuImg[index]" class="menu-icon"></span>
     <span>{{item}}</span>
     <span class="el-icon-arrow-right"></span>
     <el-divider class="el-divider"></el-divider>
    </div>
  </div>
</template>

<script>
  export default {
    name: "myMenu",
    data() {
      return {}
    },
    props: {
      menuTitles: [],
      swipes: [],
      menuImg: [],
      path: []
    },
    methods: {
      itemClick(index) {
        this.$router.push(this.path[index]);
      }
    }
  }
</script>

<style scoped>
  .my-swipe img {
    width: 100%;
    height: 200px;
  }
  .menu-body {
    position: relative;
    height: 50px;
    font-size: 20px;
    line-height: 50px;
    background: white;
    padding: 5px;
    margin-top: 3%;
  }
  .el-divider {
    margin: 5px;
  }
  .el-icon-arrow-right {
    position: absolute;
    top: 20px;
    left: 90%;
  }
</style>