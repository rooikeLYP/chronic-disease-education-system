<template>
  <div id="tools-item" @click="toolsClick">
    <slot name="tools-icon"></slot><br>
    <slot name="tools-text"></slot>
  </div>
</template>

<script>

  import {isTomorrow} from "@/function/dealDate/dealDate";
  import {request} from "@/network/request";

  export default {
    name: "tools-item",
    props: {
      path: '',
      activeColor: 'blue',
      alarmClocks: []
    },
    methods: {
      toolsClick() {
        this.$router.push(this.path)
      },
      updateClock() {
        request({
          url: '/clock/getClocks',
          method: 'post',
          data: {
            account: window.atob(this.$store.state.account)
          }
        }).then(res => {
          this.alarmClocks = res.data;
          this.alarmClocks.forEach(item => {
            if(item.上次打卡时间 !== null || item.上次打卡时间 !== '') {
              if(isTomorrow(item.上次打卡时间)) {
                request({
                  url: '/clock/updateClock',
                  method: 'post',
                  data: {
                    num: item.打卡编号,
                    isClock: '0'
                  }
                })
              }
            }

          })
        })

      }
    },
    created() {
      this.updateClock();
    }
  }
</script>

<style scoped>
  #tools-item {
    display: inline-block;
    width: 100px;
    height: 100px;
    margin-left: 20px;
    margin-right: 10px;
  }
</style>