<template>
  <div id="main">
    <nav-bar class="home-nav">
      <div slot="left" class="el-icon-arrow-left" @click="lastTick()"></div>
      <div slot="center">高血压用药指导</div>
    </nav-bar>
    <div class="main-body">
      <h2>用药指导</h2>
      <p class="text">1.坚持长期药物治疗的重要性，用降压药使血压降至理想水平后，应继续服用维持量，以保持血压相对稳定，对无症状者更应强调。</p>
      <img src="@/assets/img/disease/high/medicine/medicine_1.jpg" alt="" class="img-left">
      <img src="@/assets/img/disease/high/medicine/medicine_2.jpg" alt="" class="img-right">
      <p class="text">2.遵医嘱按时按量服药，不能擅自突然停药，经治疗血压得到满意控制后，可遵医嘱逐渐减少剂量。如果突然停药可导致血压突然升高，特别是冠心病病人突然停用β受体阻断药可诱发心绞痛、心肌梗死等。</p>
      <img src="@/assets/img/disease/high/medicine/medicine_3.png" alt="" class="img">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "highMedicine",
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