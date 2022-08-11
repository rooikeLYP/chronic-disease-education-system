<template>
  <div id="tools">
    <nav-bar>
      <div slot="center">实用小工具</div>
    </nav-bar>
    <div class="main-tools">
      <tools-bar></tools-bar>
      <main-tabber></main-tabber>
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import mainTabber from '@/components/content/mainTabber/main-tabber'
  import ToolsBar from "@/components/content/toolsBar/tools-bar";


  export default {
    name: "tools",
    components: {
      ToolsBar,
      NavBar,
      mainTabber
    },
    data() {
      return {}
    }
  }
</script>

<style scoped>
  #tools {
    height: 93vh;
    background: rgba(100,100,100,0.1);
  }
  .main-tools {
    margin-top: 44px;
  }
</style>