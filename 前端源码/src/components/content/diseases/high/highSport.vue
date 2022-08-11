<template>
  <div id="main">
    <nav-bar class="home-nav">
      <div slot="left" class="el-icon-arrow-left" @click="lastTick()"></div>
      <div slot="center">高血压运动指导</div>
    </nav-bar>
    <div class="main-body">
      <h2>运动指导</h2>
      <p class="text">1.根据年龄和血压水平选择适宜的运动方式，合理安排运动量。</p>
      <img src="@/assets/img/disease/high/sport/sport_1.jpg" alt="" class="img" style="height: 250px">
      <p class="text">2.建议每周进行3～5次、每次30分钟的有氧运动，如步行、慢跑、骑车、游泳和跳舞等。</p>
      <img src="@/assets/img/disease/high/sport/sport_2.png" alt="" class="img">
      <p class="text">3.运动强度建议中等强度更有效、更安全。</p>
      <p class="text">可选用以下方法评价中等强度：</p>
      <p class="text">（1）主观感觉：运动中心跳加快、微微出汗、自我感觉有点累;</p>
      <p class="text">（2）客观表现：运动中呼吸频率加快，可以与人交谈，但是不能唱歌；</p>
      <p class="text">（3）步行速度：每分钟120步左右；</p>
      <p class="text">（4）运动中的心率＝170-年龄；</p>
      <p class="text">（5）在休息后约10分钟内，锻炼所引起的呼吸频率增加应明显缓解，心率也恢复到正常或接近正常，否则应考虑运动强度过大。</p>
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  export default {
    name: "highSport",
    components: {
      NavBar
    },
    methods: {
      lastTick() {
        this.$router.push('/high')
      }
    }
  }
</script>

<style scoped>

</style>