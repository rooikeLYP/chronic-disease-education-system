<template>
  <div class="clock-item" :class="[isClock === '0' ? 'default' : 'active']" @click="itemClick">
    <slot name="title"></slot>
    <slot name="status-title"></slot>
    <slot name="icon"></slot>
    <slot name="start-time"></slot>
    <slot name="end-time"></slot>
    <slot name="status"></slot>
    <slot name="delete-icon"></slot>
  </div>
</template>

<script>
  export default {
    name: "clock-item",
    props: {
      isClock: {
        type: String,
        default: '0'
      }
    },
    methods: {
      itemClick() {
        this.$emit('itemClick')
      }
    }
  }
</script>

<style scoped>
  .clock-item {
    width: 92%;
    height: 100px;
    position: relative;
    left: 3%;
    border-radius: 5px;
    background: white;
  }
  .active {
    border-left-color: limegreen;
    border-left-style: solid;
    border-left-width: 7px;
  }
  .default {
    border-left-color: red;
    border-left-style: solid;
    border-left-width: 7px;
  }
</style>