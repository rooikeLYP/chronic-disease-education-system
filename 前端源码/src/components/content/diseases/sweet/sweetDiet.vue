<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">糖尿病的饮食指导</span>
    </nav-bar>
    <div class="main-body">
      <video width="100%" height="40%" src="@/assets/video/sweet/糖尿病的饮食护理.mp4" controls></video>
      <h2>糖尿病患者的饮食指导</h2>
      <h3>1.制定总热量 </h3>
      <p class="text">根据患者的年龄、性别、身高、体重、体力活动量、病情等综合因素来确定。首先要算出患者的标准体重，可参照公式：标准体重（kg）=身高（cm）-105算出标准体重，再依据每个人日常体力活动情况来估算出每千克标准体重热量需要量。儿童、青春期、哺乳期、营养不良、消瘦以及有慢性消耗性疾病应酌情增加总热量，肥胖者要严格限制总热量和脂肪含量。见表4-5。</p>
      <img src="@/assets/img/disease/sweet/diet/diet_1.png" alt="" class="img">
      <h3>2.食物组成和分配</h3>
      <p class="text">糖尿病患者的饮食原则为高碳水化合物、低脂肪、适量蛋白质和高纤维素的膳食。</p>
      <p class="text">碳水化合物应占糖尿病患者膳食总热量中的50%～60%，是热量的主要来源。提倡食用粗制米、面和一定量的杂粮。</p>
      <img src="@/assets/img/disease/sweet/diet/diet_2.png" alt="" class="img">
      <p class="text">蛋白质的摄入量占膳食总热量的10%～15%，蛋白质的需要量成人每千克标准体重约1g。在儿童，孕妇，哺乳期妇女，营养不良，消瘦，有消耗性疾病者宜增加至每千克体重1.5～2.0g。</p>
      <p class="text">糖尿病肾病者应限制蛋白质摄入量为0.8g/(kg·d),若已有肾功能不全，应摄入优质蛋白质，摄入量应减至0.6g/(kg·d)。</p>
      <img src="@/assets/img/disease/sweet/diet/diet_3.jpg" alt="" class="img">
      <p class="text">脂肪的摄入量不超过饮食总热量的30%，动物脂肪主要含饱和脂肪酸，植物油中含不饱和脂肪酸多，糖尿病患者易患动脉粥样硬化，应以植物油为主。</p>
      <img src="@/assets/img/disease/sweet/diet/diet_4.jpg" alt="" class="img">
      <p class="text">注意应定时定量，病情稳定期可按每天三餐1/5、2/5、2/5或各按1/3分配，病情不稳定者，应少量多餐，从3次正餐中匀出25～50g主食作为加餐用。</p>
      <img src="@/assets/img/disease/sweet/diet/diet_5.png" alt="" class="img">
      <p class="text">每日的食盐摄入量不超过6g，严格限制各种甜食，如糖果、点心、饼干、水果等含糖饮料，对于血糖控制良好者，可在两餐间加食水果，如苹果、橙子、梨等。</p>
      <p class="text">应增加膳食纤维的摄入，如豆类、富含纤维的谷物类（每份食物≥5g纤维）、水果、蔬菜和全麦食物均为膳食纤维的良好来源。</p>
      <img src="@/assets/img/disease/sweet/diet/diet_6.png" alt="" class="img">
      <img src="@/assets/img/disease/sweet/diet/diet_7.png" alt="" class="img">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  export default {
    name: "sweetDiet",
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
</style>