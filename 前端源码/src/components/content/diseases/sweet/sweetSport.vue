<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">糖尿病的运动指导</span>
    </nav-bar>
    <div class="main-sport">
      <h2>糖尿病患者的运动指导</h2>
      <p class="text">运动的方式、强度、时间应根据患者的总体健康状况来定，推荐糖尿病患者的运动方式是低至中等强度的有氧运动，如散步，快步走、健美操、跳舞、打太极拳、游泳等。合适的运动强度为靶心率=[220—年龄（岁）]×（60%～80%）。运动时间一般为40分钟，包括准备活动、运动训练和放松活动三部分，其中达到靶心率的运动训练时间为20～30分钟，餐后30分钟至1小时开始运动为宜。运动频率为每天1次或每周3～4次，肥胖患者可根据身体状况适当增加活动次数，应注意坚持循序渐进、量力而行和持之以恒的原则。</p>
      <img src="@/assets/img/disease/sweet/sport/sport_1.png" alt="" class="img">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  export default {
    name: "sweetSport",
    components: {
      NavBar
    },
    methods: {
      lastTick() {
        this.$router.push('/sweet')
      }
    }
  }
</script>

<style scoped>
  #sweetSport {
    background: white;
    font-family: 宋体;
  }
  .main-sport {
    margin-top: 44px;
    padding: 3%;
  }
  .sport-text {
    text-indent: 2rem;
    line-height: 30px;
  }
  .sport {
    width: 100%;
  }
</style>