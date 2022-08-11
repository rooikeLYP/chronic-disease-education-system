<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">饮食知识指导</span>
    </nav-bar>
    <div class="main-body">
      <h2>饮食知识指导</h2>
      <p class="text">冠心病患者宜食用低热量、低脂、低胆固醇、低盐、适量蛋白质及富含纤维素含量的清淡饮食。少量多餐，多吃水果蔬菜，保持大便通畅，切忌用力排便，以免诱发冠心病发作。</p>
      <p class="text">膳食结构要合理，避免摄入过多的脂肪和大量的甜食，预防肥胖、高脂血症、高血压和糖尿病的发生，超重和肥胖者更应主动减少热量摄入。若连续长期食用高脂肪、高热量饮食，可使血脂进一步增高，血液粘稠度增加，动脉样硬化斑块容易形成，最终导致血栓复发。少食肥肉、动物内脏、鱼卵、花生等含油脂多、胆固醇高的食物，不宜食用油炸、煎炒、烧烤类食物。减少钠的摄入，一般每日不超过6g。蛋白质不易消化，容易增加心脏的负担，因此摄入蛋白质应适量，每日食物中蛋白质的含量以每公斤体重不超过1g为宜，牛奶、酸奶、鱼类和豆制品对防治冠心病有利。适当增加膳食纤维摄入，不仅可以保持大便通畅，还有助于降低血脂。</p>
      <img src="@/assets/img/disease/heart/diet/diet.png" alt="" class="img">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "heartDiet",
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