<template>
  <div class="show-disease" @click="itemClick()">
    <slot name="disease-img"></slot>
    <slot name="disease-name"></slot>
    <slot name="disease"></slot>
    <slot name="disease-reason"></slot>
  </div>
</template>

<script>

  export default {
    name: "show-disease",
    props: {
      disease: '',
      path: ''
    },
    methods: {
      itemClick() {
        this.$router.push(this.path);
      }
    }
  }
</script>

<style scoped>
  .show-disease {
    width: 46%;
    height: 150px;
    position: relative;
    padding-bottom: 44px;
    margin: 3px;
    /*border: 1px solid rgba(50,50,50,0.1);*/
    box-shadow: 1px 1px 4px rgba(50,50,50,0.2);
    border-radius: 10px;
    background: white;
  }
  .el-divider {
    margin: 5px;
  }
</style>