<template>
  <div id="main">
    <nav-bar class="home-nav">
      <div slot="left" class="el-icon-arrow-left" @click="lastTick()"></div>
      <div slot="center">病情检测</div>
    </nav-bar>
    <div class="main-body">
      <h2>测血压</h2>
      <p class="text">1.推荐使用合格的上臂式自动血压计测量血压，血压未达标者，建议每天早晚各测量血压1次，每次测量2～3遍，连续7天，以后6天血压平均值作为医生治疗的参考。血压达标者，建议每周测量1天。</p>
      <p class="text">2.测血压之前应休息15～30分钟，避免饮用咖啡、茶等刺激性饮料，身体保持放松状态，手掌向上平伸，肘部与心脏处于同一水平，上臂外展，与身体呈45°角，手放松勿握拳；袖带的下缘距肘窝约1～2cm，袖带卷扎的松紧以刚好插入一指为宜。缠得过紧，测得的血压偏低，而过松则偏高。袖带的胶管应放在肱动脉搏动点；两次测量的时间间隔不得少于3分钟，且最好每次都能定时间、定部位、定体位进行测量。</p>
      <img src="@/assets/img/disease/high/monitor/monitor_1.png" alt="" class="img">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "highMonitor",
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