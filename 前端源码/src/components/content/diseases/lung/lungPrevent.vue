<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">预防知识指导</span>
    </nav-bar>
    <div class="main-body">
      <h2>慢阻肺预防知识的指导</h2>
      <p class="text">1.戒烟  吸烟是导致COPD的主要危险因素，不去除病因，单凭药物治疗难以取得良好的疗效。因此阻止COPD发生和进展的关键措施是戒烟。</p>
      <p class="text">2.减少职业性粉尘和化学物质吸入，对于从事接触职业粉尘的人群，如煤矿、金属矿、棉纺织业、化工行业及某些机械加工等工作人员应做好劳动保护。</p>
      <p class="text">3.减少室内空气污染  避免在通风不良的空间燃烧生物燃料，如烧柴做饭、在室内生炉火取暖、被动吸烟等。</p>
      <p class="text">4.防治呼吸道感染  积极预防上呼吸道感染，在呼吸道传染病流行期间，尽量避免到人群密集的地方。潮湿、大风、严寒、雾霾天气时避免室外活动，根据气候变化及时增减衣服，避免受凉感冒。发生上呼吸道感染应积极治疗，必要时秋冬季节注射流感疫苗、肺炎疫苗。</p>
      <img src="@/assets/img/disease/lung/prevent/prevent.png" alt="" class="img">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "lungPrevent",
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