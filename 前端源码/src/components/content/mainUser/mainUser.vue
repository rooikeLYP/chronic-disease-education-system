<template>
  <div id="mainUser" @click="itemClick">
    <img v-if="img" :src="img" alt="">
    <img v-else :src="require('@/assets/img/'+ imgPath)" alt="">
    <div class="text">
      <span class="user-name">{{name}}</span><br>
      <span class="user-account">账号：{{account}}</span>
      <span class="el-icon-arrow-right"></span>
    </div>
  </div>
</template>

<script>
  export default {
    name: "mainUser",
    props: {
      img: {
        type: String,
        default: ''
      },
      account: String,
      name: String,
    },
    computed: {
      imgPath() {
        let str = ('@/assets/img/users/default/default.jpg').split('/');
        str.splice(0,3);
        return str.join('/')
      }
    },
    methods: {
      itemClick() {
        this.$emit("itemClick")
      }
    }
  }
</script>

<style scoped>
  #mainUser{
    overflow: hidden;
    background: white;
    padding-top: 10px;
    padding-bottom: 10px;
    border-bottom: 10px solid rgba(100,100,100,0.2);
  }

  img {
    width: 80px;
    height: 80px;
    border-radius: 40px;
    margin: 10px;
    vertical-align: bottom;
    float: left;
  }

  .text {
    float: left;
    margin-top: 20px;
    margin-left: 10px;
  }
  .user-name {
    font-size: 18px;
    font-weight: bold;
  }
  .user-account {
    font-size: 14px;
    font-weight: lighter;
    margin-top: 10px;
    position: relative;
    top: 10px;
  }
  .el-icon-arrow-right {
    position: absolute;
    top: 80px;
    left: 80%;
    font-size: 25px;
  }
</style>