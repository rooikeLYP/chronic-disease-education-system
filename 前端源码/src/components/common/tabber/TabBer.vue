<template>
  <div id="tar-bar">
    <slot></slot>
  </div>
</template>

<script>
  export default {
    name: "TabBer"
  }
</script>

<style scoped>
  #tar-bar{
    display: flex;
    background: #f6f6f6;

    position: fixed;
    left: 0;
    right: 0;
    bottom: 0;

    box-shadow: 0 -1px 1px rgba(100, 100, 100, 0.2);
  }


</style>
