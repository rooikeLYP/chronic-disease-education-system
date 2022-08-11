<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">心前区疼痛处理方法</span>
    </nav-bar>
    <div class="main-body">
      <h2>一旦发生心前区疼痛怎么办</h2>
      <h3>1.休息与活动：</h3>
      <p class="text">心绞痛发作时应立即停止正在进行的活动，就地休息，一般病人停止活动后症状即可消除。</p>
      <h3>2.心理护理：</h3>
      <p class="text">安慰病人，解除紧张不安的情绪，减少心肌耗氧量。</p>
      <h3>3.给氧：</h3>
      <p class="text">保证病人血氧饱和度在95%以上。</p>
      <h3>4.疼痛观察：</h3>
      <p class="text">评估病人疼痛的部位、性质、程度、持续时间，观察病人有无面色苍白、大汗、恶心、呕吐等伴随症状。疼痛发作时测血压、心率，做心电图，为疾病判断提供依据。</p>
      <h3>5.用药护理：</h3>
      <p class="text">（1）心绞痛发作时给予舌下含服硝酸甘油(嚼碎后含服效果更好)，用药后注意观察病人胸痛变化情况，如服药后3～5分钟仍不缓解，可重复使用。对于心绞痛发作频繁者，可遵医嘱给予硝酸甘油静滴，但应控制滴速，以防低血压发生。部分病人用药后出现面色潮红，头部胀痛，头晕，心动过速，心悸等不适，应告知病人是由于药物所产生的血管扩张作用导致，以解除顾虑。</p>
      <p class="text">（2）应用他汀类药物时，因严密监测转氨酶及肌酸激酶等生化指标，及时发现药物可能引起的肝脏损害和肌病。采用强化降脂治疗时，应注意监测药物的安全。</p>
      <h3>6.减少或避免诱因：</h3>
      <p class="text">疼痛缓解后，与病人一起分析心绞痛发作的诱因。保持排便通畅，切记用力排便，以免诱发心绞痛。调节饮食，禁烟酒。保持心境平和，改变焦躁易怒，争强好胜的性格等。</p>
      <img src="@/assets/img/disease/heart/handle/handle_1.jpg" alt="" class="img-left">
      <img src="@/assets/img/disease/heart/handle/handle_2.png" alt="" class="img-right">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "heartHandle",
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