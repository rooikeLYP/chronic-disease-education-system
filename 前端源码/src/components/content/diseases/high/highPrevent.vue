<template>
  <div id="main">
    <nav-bar class="home-nav">
      <div slot="left" class="el-icon-arrow-left" @click="lastTick()"></div>
      <div slot="center">高血压预防指导</div>
    </nav-bar>
    <div class="main-body">
      <h2>疾病预防知识指导</h2>
      <p class="text">1.定期监测血压，发现血压升高或出现头晕、头痛、颈项板紧、耳鸣、疲劳、心悸等，立即到医院就诊。</p>
      <img src="@/assets/img/disease/high/prevent/prevent_1.png" alt="" class="img">
      <h3>2.合理膳食：</h3>
      <p class="text">（1）饮食宜清淡，避免油炸食品，少量多餐、忌暴饮暴食；</p>
      <p class="text">（2）限制盐的摄入量，每人每日食盐量应该控制在6g之内，这里的食盐量包括烹调用盐及其他食物中所含钠折合成食盐的总量；</p>
      <p class="text">（3）多吃含钾、钙丰富的而含钠低的食品，如土豆、茄子、海带、莴笋等。含钙高的食品如牛奶、虾皮等；</p>
      <img src="@/assets/img/disease/high/prevent/prevent_2.png" alt="" class="img">
      <p class="text">（4）限制脂肪的摄入，烹调时选用植物油；⑤多吃新鲜蔬菜和水果。</p>
      <img src="@/assets/img/disease/high/prevent/prevent_3.jpg" alt="" class="img">
      <p class="text">3.日常生活要有规律，避免过度劳累，保证睡眠充足，戒烟限酒。</p>
      <img src="@/assets/img/disease/high/prevent/prevent_4.png" alt="" class="img" style="height: 250px">
      <p class="text">4.坚持锻炼身体，增加体力活动，如散步、气功、太极拳、跳舞等。</p>
      <img src="@/assets/img/disease/high/prevent/prevent_5.png" alt="" class="img" style="height: 250px">
      <p class="text">5.调整情绪，保持心情舒畅和心态平衡，避免情绪激动、过度紧张和焦虑。</p>
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import '@/assets/css/main.css'
  export default {
    name: "highPrevent",
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