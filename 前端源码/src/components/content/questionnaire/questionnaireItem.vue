<template>
  <div id="questionnaire-item" @click="itemClick()">
    <span class="el-icon-tickets"></span>
    <span>{{questionnaire.问卷名称}}</span>
    <span class="el-icon-arrow-right"></span>
  </div>
</template>

<script>
  export default {
    name: "questionnaireItem",
    props: {
      questionnaire: {
        type: Object,
        default: {}
      },
      userQuestion: {
        type: Object,
        default: {}
      }
    },
    methods: {
      itemClick() {
        this.$emit('itemClick');
      }
    }
  }
</script>

<style scoped>
  #questionnaire-item {
    background: white;
    height: 50px;
    font-size: 20px;
    line-height: 50px;
    margin-top: 4%;
  }
  span {
    margin-left: 2%;
    color: #606266;
  }
  .el-icon-tickets {
    color: sandybrown;
  }
  .el-icon-arrow-right {
    margin-left: 55%;
  }
</style>