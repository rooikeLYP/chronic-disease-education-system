<template>
  <div id="question-title">
    <span class="span">问卷-</span>
    <span class="span"><slot name="name"></slot></span>
    <span class="span"><slot name="status"></slot></span>
  </div>
</template>

<script>
  export default {
    name: "questionTitle"
  }
</script>

<style scoped>
  #question-title {
    margin-top: 44px;
    height: 60px;
    width: 96%;
    margin-left: 2%;
    line-height: 60px;
    background: white;
    border-radius: 10px;
    text-align: center;
    color: #606266;
  }
  .span {
    font-size: 20px;
  }
</style>