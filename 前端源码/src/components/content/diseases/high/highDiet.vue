<template>
  <div id="main">
    <nav-bar class="home-nav">
      <div slot="left" class="el-icon-arrow-left" @click="lastTick()"></div>
      <div slot="center">高血压饮食指导</div>
    </nav-bar>
    <div class="main-body">
      <h2>饮食指导</h2>
      <p class="text">1.高血压患者饮食宜清淡，低盐低脂低糖；宜高维生素、高纤维素、高钙高钾。</p>
      <img src="@/assets/img/disease/high/diet/diet_1.jpg" alt="" class="img">
      <p class="text">2.高血压饮食疗法最关键是要减盐，中国营养学会推荐健康成人每日钠盐摄入量不宜超过6g，高血压患者不超过3g(普通啤酒瓶盖去胶垫后一平盖相当于6g)。
        尽量避免进食高盐食物和调味品，如咸菜、腌菜、腌肉等；利用蔬菜本身的风味来调味，例如将青椒、蕃茄、洋葱等和味道清淡的食物一起烹煮；利用醋、柠檬汁、苹果汁、番茄汁等各种酸味调味汁来增加食物味道；采用富钾低钠盐代替普通钠盐。</p>
      <img src="@/assets/img/disease/high/diet/diet_2.jpg" alt="" class="img-left">
      <img src="@/assets/img/disease/high/diet/diet_3.jpg" alt="" class="img-right">
      <p class="text">3 .限制总热量，尤其要控制油脂类型和摄入量。减少动物食品和动物油摄入，如动物内脏、肥肉、蟹黄、鱼子、蛋黄等富含饱和脂肪和胆固醇的食品摄入量。减少反式脂肪酸摄入，如各类西式糕点、巧克力派、咖啡伴侣、速食食品等摄入量，适量选橄榄油等植物油。</p>
      <img src="@/assets/img/disease/high/diet/diet_4.jpg" alt="" class="img">
      <p class="text">4.适量补充蛋白质，增加新鲜蔬菜和水果及膳食钙摄入。富含钾、钙、维生素、
        微量元素的食物如新鲜蔬菜、水果、土豆、蘑菇等；推荐食用植物油；富含膳食纤维的食物如燕麦、薯类、粗粮、杂粮等；富含优质蛋白、低脂肪、低胆固醇食物如无脂奶粉、鸡蛋清、鱼类、去皮禽肉、瘦肉、豆制品等。鱼类蛋白是优质蛋白，鱼油含多不饱和脂肪酸，应多吃鱼类。</p>
      <img src="@/assets/img/disease/high/diet/diet_5.jpg" alt="" class="img">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "highDiet",
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