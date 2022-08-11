<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">慢性阻塞性肺疾病</span>
    </nav-bar>
    <div class="main-body">
      <h2>一.什么是慢性阻塞性肺疾病</h2>
      <p class="text">慢性阻塞性肺疾病简称慢阻肺（COPD）,是以持续气流受限为特征的，可以预防和治疗的疾病，其气流受限多呈进行性发展，与气道和肺组织对香烟烟雾等有害气体或有害颗粒的异常慢性炎症反应有关。</p>
      <img src="@/assets/img/disease/lung/introduce/introduce_1.jpg" alt="" class="img" >
    </div>
    <div class="main-body">
      <h2>二.慢阻肺病因是什么</h2>
      <p class="text">慢阻肺的发生是遗传与环境致病因素共同作用的结果</p>
      <img src="@/assets/img/disease/lung/introduce/reason_1.jpg" alt="" class="img">
      <h3>1.遗传因素</h3>
      <p class="text">某些遗传因素（也可以称为个体易感因素）可增加慢阻肺发病的危险性。目前已知的慢阻肺遗传因素为α1-抗胰蛋白酶缺乏，重度α1-抗胰蛋白酶缺乏与肺气肿形成有关。基因多态性在慢阻肺的发病中也有一定作用。</p>
      <h3>2.环境因素</h3>
      <p class="text">（1）吸烟：吸烟是导致慢阻肺的主要危险因素。</p>
      <img src="@/assets/img/disease/lung/introduce/reason_2.jpg" alt="" class="img" >
      <p class="text">（2）空气污染：化学气体（氯、一氧化氮、二氧化硫等）对支气管黏膜有刺激和细胞毒性作用。空气中的烟尘或二氧化硫明显增加时，慢阻肺急性发作显著增多。其他粉尘也刺激支气管黏膜，使气道清除功能遭受损害，为细菌入侵创造条件。大气中直径2.5～10μm的颗粒物，即PM2.5和PM10可能与慢阻肺的发生有一定关系。</p>
      <img src="@/assets/img/disease/lung/introduce/reason_3.jpg" alt="" class="img">
      <p class="text">（3）职业性粉尘和化学物质：当职业性粉尘（二氧化硅、煤尘、棉尘和蔗尘等）及化学物质（烟雾、过敏原、工业废气和室内空气污染等）的浓度过大或接触时间过久，均可导致慢阻肺的发生。接触某些特殊物质、刺激性物质、有机粉尘及过敏原也可使气道反应性增加。</p>
      <img src="@/assets/img/disease/lung/introduce/reason_4.jpg" alt="" class="img">
      <p class="text">（4）生物燃料烟雾：生物燃料是指柴草、木头、木炭、庄稼杆和动物粪便等，其烟雾的主要有害成分包括碳氧化物、氮氧化物、硫氧化物和未燃烧完全的碳氢化合物颗粒与多环有机化合物等。使用生物燃料烹饪时产生的大量烟雾可能是不吸烟妇女发生慢阻肺的重要原因。生物燃料所产生的室内空气污染与吸烟具有协同作用。</p>
      <img src="@/assets/img/disease/lung/introduce/reason_5.jpg" alt="" class="img">
      <p class="text">（5）感染：呼吸道感染是慢阻肺发病和加剧的一个重要因素，病毒和（或）细菌感染是慢阻肺急性加重的常见原因。</p>
      <img src="@/assets/img/disease/lung/introduce/reason_6.jpg" alt="" class="img" style="height: 250px">
    </div>
    <div class="main-body">
      <h2>三.慢阻肺有哪些临床表现 </h2>
      <h3>1.咳嗽  </h3>
      <p class="text">慢性咳嗽常为最早出现的症状，随病程发展可终身不愈，常晨间咳嗽明显，夜间有阵咳或排痰。当气道严重阻塞，通常仅有呼吸困难而不表现出咳嗽。</p>
      <h3>2.咳痰  </h3>
      <p class="text">咳痰一般为白色黏液或浆液性泡沫痰，偶可带血丝，清晨排痰较多。急性发作期痰量增多，可有脓性痰。</p>
      <h3>3.呼吸困难  </h3>
      <p class="text">气短或呼吸困难慢性阻性肺疾病的主要症状，早期在劳力时出现，后逐渐加重，以致在日常生活甚至休息时也感到气短。</p>
      <h3>4.喘息和胸闷 </h3>
      <p class="text">分患者特别是重度患者或急性加重时出现喘息和胸闷。 </p>
      <h3>5.其他</h3>
      <p class="text">疲乏、消瘦、焦虑等常在慢性阻塞性肺疾病病情严重时出现，但并非慢性阻塞性肺疾病的典型表现。 </p>
      <img src="@/assets/img/disease/lung/introduce/performance_1.jpg" alt="" class="img">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "lungKnowledge",
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