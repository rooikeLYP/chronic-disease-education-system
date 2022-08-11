<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
  import home from "@/views/home/home";
  import mainTabber from '@/components/content/mainTabber/main-tabber'
  export default {
    components: {
      home,
      mainTabber
    }
  }
</script>
<style>
  @import "assets/css/base.css";
  #app {
    background: rgba(150,150,150,0.08);
  }
</style>