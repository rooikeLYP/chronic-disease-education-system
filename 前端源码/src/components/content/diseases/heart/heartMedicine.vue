<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">用药指导</span>
    </nav-bar>
    <div class="main-body">
      <h2>用药指导</h2>
      <p class="text">冠心病治疗药物分为改善预后和改善心绞痛两类，实现药物最大疗效的前提是使用有效药物、有效剂量、控制危险因素及主动管理药物的相互作用和不良反应，同时应提高患者的服药依从性。</p>
      <p class="text">1.发作时宜选用作用快、疗效高的硝酸酯制剂。</p>
      <p class="text">这类药物可扩张冠状动脉，增加冠状动脉血流外，还可扩张外周血管，减轻心脏负担，从而缓解心绞痛。常用药物有：硝酸甘油和硝酸异山梨醇酯舌下含服，必要时可考虑用镇静剂。</p>
      <p class="text">2.缓解期可应用作用持久的抗心绞痛药物和改善预后的药物。</p>
      <p class="text">缓解期常应用硝酸异山梨醇酯或长效硝酸甘油制剂、抗血小板聚集药物、β-受体阻滞剂、钙通道阻滞剂、降脂药、中药等。抑制血小板聚集的常用药物有阿司匹林、氯吡格雷，防止血栓形成，注意观察有无消化道溃疡、有无出血，并定期监测患者的凝血功能。β受体阻滞剂能阻断心脏β肾上腺素能受体，减慢心率，减弱心肌收缩力，降低血压，减少心肌耗氧量及心肌缺血发作，增加患者运动耐量，该药能引起低血压，宜从小量开始，同时注意监测血压变化，部分患者用药后可出现颜面潮红、头胀痛、头部跳动感、心悸等不适，应告诉患者是由于药物导致头面部血管扩张造成的，以解除顾虑。硝酸酯类药物的不良反应包括头痛、面部潮红、心率反射性加快和低血压，上述不良反应以短效硝酸甘油更明显，尤其是第1次含服硝酸甘油时，应注意可能发生体位性低血压。钙通道阻滞剂常用药物有维拉帕米，常见不良反应包括外周水肿、便秘、心悸、面部潮红，低血压等。</p>
      <img src="@/assets/img/disease/heart/medicine/medicine.jpg" alt="" class="img">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "heartMedicine",
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