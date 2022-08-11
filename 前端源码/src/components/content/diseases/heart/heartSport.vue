<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">运动指导</span>
    </nav-bar>
    <div class="main-body">
      <h2>运动指导</h2>
      <p class="text">根据冠心病患者的身体情况确定运动的形式进行功能锻炼，以有氧运动为宜，如散步、骑车、游泳、太极拳等。运动时患者主观感觉轻松、睡眠改善、食欲增加、无任何不适为宜，逐步增加活动量。当运动过程中出现不适，应立即停止活动。运动时应注意：</p>
      <p class="text">1.运动前后避免情绪激动。精神紧张，情绪激动均可使血中儿茶酚胺增加，尤其运动时更易诱发室颤发生的危险，因此，对于心绞痛发作3天之内，心肌梗死后半年之内的患者，不宜做比较剧烈的运动。</p>
      <p class="text">2.运动前不宜饱餐。因为进食后人体内血液供应需重新分配，胃肠道血容量增加，而心脏供血相对减少，易引起冠状动脉相对供血不足，从而诱发心绞痛。</p>
      <p class="text">3.运动要循序渐进，持之以恒，平时不运动者，不要突然从事剧烈的运动。</p>
      <img src="@/assets/img/disease/heart/sport/sport.png" alt="" class="img">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "heartSport",
    components: {
      NavBar
    },
    methods: {
      lastTick() {
        this.$router.push('/heart')
      }
    }
  }
</script>

<style scoped>

</style>