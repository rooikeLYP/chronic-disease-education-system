<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">慢性阻塞性肺疾病用药指导</span>
    </nav-bar>
    <div class="main-body">
      <h2>用药指导</h2>
      <p class="text">药物治疗用于预防和控制症状，减少急性加重的频率和严重程度，提高活动耐力和生命质量。根据疾病的严重程度，逐步增加治疗，如没有出现明显的药物不良反应或病情恶化，则应在同一水平维持长期的规律治疗。</p>
      <p class="text">（1）支气管舒张剂：支气管舒张剂可松弛支气管平滑肌、扩张支气管、缓解气流受限，是控制慢阻肺症状的主要治疗措施。短期按需应用可缓解症状，长期规则应用可预防和减轻症状，增加运动耐力，但不能使所有患者的FEV1得到改善。与口服药物相比，吸入剂的不良反应小，因此多首选吸入治疗。主要的支气管舒张剂有β2-受体激动剂、抗胆碱药及茶碱类，根据药物作用及患者的治疗反应选用。</p>
      <p class="text">（2）激素：慢阻肺稳定期长期应用吸入激素治疗并不能阻止其FEV1的降低趋势。长期规律的吸入激素适用于FEV1占预计值％<50％（Ⅲ级和Ⅳ级）且有临床症状及反复加重的慢阻肺患者。吸入激素和β2受体激动剂联合应用较分别单用的效果好，目前已有氟地卡松／沙美特罗、布地奈德/福莫特罗两种联合制剂。FEV1占预计值％<60％的患者规律吸入激素和长效β2-受体激动剂联合制剂，能改善症状和肺功能，提高生命质量，减少急性发作。</p>
      <p class="text">（3）祛痰药： 对痰不易咳出者可选用盐酸氨溴索30mg，每天3次。祛痰药的不良反应：溴己新偶见恶心、转氨酶增高，消化性溃疡者慎用。盐酸氨溴索是润滑性祛痰药，不良反应较轻。</p>
      <img src="@/assets/img/disease/lung/medicine/medicine.jpg" alt="" class="img">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "lungMedicine",
    components: {
      NavBar
    },
    methods: {
      lastTick() {
        this.$router.push('/lung')
      }
    }
  }
</script>

<style scoped>

</style>