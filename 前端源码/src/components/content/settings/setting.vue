<template>
  <div id="setting">
    <slot name="setting-icon"></slot>
    <span class="setting-text"><slot name="setting-text"></slot></span>
    <slot name="setting-picture"></slot>
    <span class="el-icon-arrow-right"></span>
    <el-divider class="el-divider"></el-divider>
  </div>
</template>

<script>
  export default {
    name: "setting"
  }
</script>

<style scoped>
  #setting {
    position: relative;
    height: 50px;
    font-size: 20px;
    line-height: 50px;
    background: white;
    padding: 5px;
    margin-top: 1px;
  }

  .el-icon-arrow-right {
    position: absolute;
    top: 20px;
    left: 90%;
  }
  .setting-text {
    position: relative;
    left: 5px;
  }
  .el-divider {
    margin: 5px;
  }
</style>