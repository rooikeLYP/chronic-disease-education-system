<template>
  <div class="nav-bar" :style="navBarStyle">
    <div class="left-nav-bar"><slot name="left"></slot></div>
    <div class="center-nav-bar"><slot name="center"></slot></div>
    <div class="right-nav-bar"><slot name="right"></slot></div>
  </div>
</template>

<script>
  export default {
    name: "NavBar",
    computed: {
      navBarStyle() {
        return {color: 'white',fontSize: '20px'}
      }
    }
  }
</script>

<style scoped>
  .nav-bar {
    position: fixed;
    left: 0;
    right: 0;
    top: 0;
    z-index: 9;
    width: 100%;
    line-height: 44px;
    background: #409EFF;
    display: flex;
    text-align: center;
    box-shadow: 0 1px 1px rgba(100, 100, 100, 0.3);
  }
  .left-nav-bar, .right-nav-bar {
    width: 64px;
    /*display: inline-block;*/
  }

  .center-nav-bar {
    flex: 1;
    /*width: 60%;*/
    /*display: inline-block;*/
  }
</style>