<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">糖尿病的用药指导</span>
    </nav-bar>
    <div class="main-body">
      <div class="medicine-inject">
        <h2>一.胰岛素的注射部位及注意事项</h2>
        <p class="text">使用胰岛素治疗的患者，在餐前30分钟皮下注射，注射后要按时进食，否则会有低血糖危险。宜选择皮肤疏松的部位进行皮下注射，如上臂三角肌、臀大肌、大腿前侧、腹部等。腹部吸收最快，其次分别为上臂、大腿和臀部。若参加运动锻炼，宜在腹部注射，不宜在大腿、臀部、上臂等部位注射，以免加快胰岛素吸收，诱发低血糖。注射部位要经常更换，长期注射同一部位可能导致局部皮下脂肪萎缩或增生、局部硬结。注射胰岛素时应严格无菌操作，防止发生感染。</p>
        <img src="@/assets/img/disease/sweet/medicine/medicine_1.png" alt="" class="img">
      </div>
      <div class="medicine-eat">
        <h2>二.口服降糖药物</h2>
        <p class="text">口服降糖药物，如磺脲类药应在餐前半小时服用，双胍类药在餐中或餐后服用，α葡萄糖苷酶抑制剂应与第一口饭同服，服药后一定要规律进食，否则会因药物的降糖作用而引起低血糖反应。</p>
        <img src="@/assets/img/disease/sweet/medicine/medicine_2.png" alt="" class="img">
      </div>
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  export default {
    name: "sweetMedicine",
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
  #sweet-medicine {
    background: white;
    font-family: 宋体;
  }
  .main-medicine {
    margin-top: 44px;
  }
  .medicine-inject, .medicine-eat {
    padding: 3%;
  }
  .medicine-text {
    text-indent: 2rem;
    line-height: 30px;
  }
  .medicine {
    width: 100%;
    height: 50%;
  }
</style>