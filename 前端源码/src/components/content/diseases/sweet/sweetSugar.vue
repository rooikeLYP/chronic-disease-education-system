<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">低血糖反应</span>
    </nav-bar>
    <div class="main-body">
      <h2>一.低血糖反应的表现</h2>
      <p class="text">低血糖的临床表现具体分为两类：</p>
      <p class="text">1.自主神经过度兴奋的表现：多有肌肉震颤、心悸、出汗、饥饿感、软弱无力、紧张、焦虑、流涎、面色苍白、心率加快、四肢冰凉等。</p>
      <p class="text">2.脑功能障碍表现：初期为注意力不集中、反应迟钝、头晕、嗜睡、视物不清、步态不稳，后可出现幻觉、躁动、性格改变、认知障碍等，严重时可发生抽搐、昏迷。</p>
      <img src="@/assets/img/disease/sweet/low/lowSugar.jpg" alt="" class="img">
    </div>
    <div class="main-body">
      <h2>二.如何预防低血糖反应</h2>
      <p class="text">预防低血糖的发生应采取的措施包括：</p>
      <p class="text">1.遵医嘱服药，不要擅自加大药物剂量，也不要随意调整服药时间；尤其应用胰岛素注射治疗的患者，胰岛素注射时间过早、量过大更易引起低血糖；</p>
      <p class="text">2.饮食宜规律，定时定量，由于各种原因引起的食欲减退或胃肠道疾病引起的恶心呕吐、腹泻时，应到医院就诊，根据血糖监测、遵医嘱调整药物剂量；</p>
      <p class="text">3.运动要根据患者的身体状况选择适合的运动方式、强度、时间等，避免过量运动；</p>
      <p class="text">4.尽量减少饮酒，尤其勿空腹饮酒，因酒精刺激胰岛素分泌，容易引起低血糖；</p>
      <p class="text">5.应随身携带糖果，以备发生低血糖时急用；⑥外出时随身携带糖尿病病情卡，卡上注明患者姓名、诊断、家人联系电话等，一旦出现严重低血糖，便于其他人了解病情、紧急施救并通知家人。</p>
      <img src="@/assets/img/disease/sweet/low/lowSugar_1.jpg" alt="" class="img-left">
      <img src="@/assets/img/disease/sweet/low/lowSugar_2.jpg" alt="" class="img-right">
    </div>
    <div class="main-body">
      <h2>三.发生低血糖如何处理</h2>
      <p class="text">一旦确定患者发生低血糖，应尽快补充糖分。神志清醒者，应尽快食用一些含糖量高的食物或饮料，如糖水、含糖饮料、饼干、面包等。若病情重，神志不清者，应立即将患者置于平卧位，头偏向一侧，并立即拨打急救电话，送往医院进行救治。若有条件者，首先可采取静脉注射50%的葡萄糖20ml～40ml，切勿给患者喂食或饮水，避免发生窒息。</p>
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import '@/assets/css/main.css'
  export default {
    name: "sweetSugar",
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