<template>
  <div id="guide" @click="itemClick">
    <div class="main-guide">
      <img :src="require('@/assets/img/'+ imgPath)" alt="">
      <slot name="title"></slot>    </div>
    <el-divider></el-divider>
  </div>

</template>

<script>
  export default {
    name: "guide",
    props: {
      path: '',
      img: {
        type: String,
        default: ''
      },
    },
    computed: {
      imgPath() {
        let str = this.img.split('/');
        str.splice(0,3);
        return str.join('/')
      }
    },
    methods: {
      itemClick() {
        this.$router.push(this.path)
      }
    }
  }
</script>

<style scoped>
  img {
    width: 30%;
    height: 100%;
    float: left;
    margin-top: 6%;
    margin-left: 3%;
    margin-right: 3%;
    border-radius: 10px;
  }
  .main-guide {
    overflow: hidden;
  }
  #guide {
    margin: 2%;
    border-radius: 10px;
    background: white;
  }
</style>