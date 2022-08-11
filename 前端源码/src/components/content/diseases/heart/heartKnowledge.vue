<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">疾病知识指导</span>
    </nav-bar>
    <div class="main-body">
      <h2>一.什么是冠心病</h2>
      <p class="text">冠状动脉粥样硬化性心脏病是指由于冠状动脉粥样硬化使管腔狭窄、阻塞和（或）因冠状动脉功能性改变（痉挛）导致心肌缺血、缺氧或坏死而引发的心脏病，统称为冠状动脉性心脏病，简称冠心病，归属为缺血性心脏病，是动脉粥样硬化导致器官病变的最常见类型。</p>
    </div>
    <div class="main-body">
      <h2>二.冠心病的病因有哪些</h2>
      <p class="text">（1） 年龄、性别：本病多见于40岁以上的中老年人群，49岁以后进展较快。男性与女性相比，女性发病率较低，但在更年期后因雌激素和高密度脂蛋白（HDL）减少，发病率增加。</p>
      <p class="text">(2) 血脂异常：脂质代谢异常是动脉粥样硬化最重要的危险因素。总胆固醇（TC）、甘油三酯（TG）、低密度脂蛋白（LDL）或者极低密度脂蛋白（VLDL）升高，高密度脂蛋白（HDL）降低，尤其是它的亚组分Ⅱ(HDLⅡ)减低，载脂蛋白A(ApoA)降低，载脂蛋白B(ApoB)上升都被认为是危险因素。此外认为脂蛋白(a)[Lp(a)]增高是独立的危险因素。在临床实践中，以TC与LDL增高最受关注。</p>
      <p class="text">(3) 高血压：无论收缩压还是舒张压的升高均会增加冠心病的发生风险。大量研究表明，高血压是冠心病的主要危险因素。血压偏高或处于正常高值时，冠心病的发病率及相对危险度显著增高，高血压患者患本病较血压正常者高3～4倍。</p>
      <p class="text">(4) 吸烟：吸烟可造成动脉壁氧含量不足，促进动脉粥样硬化的形成。吸烟者与不吸烟者比较，冠心病的发病率和病死率增高 2～6倍，且与每天吸烟量以及烟龄长短呈正相关，被动吸烟也是冠心病的危险因素。</p>
      <p class="text">(5) 糖尿病和糖耐量异常：糖尿病是冠心病发病的高危因素。流行病学研究显示，糖尿病患者易发生冠心病。与无糖尿患者比较，糖尿病患者心血管疾病风险增加2～5倍，且动脉粥样硬化进展迅速。糖耐量降低者也常见冠心病患者。</p>
      <p class="text">(6) 危险因素：如肥胖，缺乏锻炼，遗传因素，长期精神紧张和情绪等因素。</p>
      <img src="@/assets/img/disease/heart/introduce/reason_1.png" alt="" class="img-left">
      <img src="@/assets/img/disease/heart/introduce/reason_2.jpg" alt="" class="img-right">
      <img src="@/assets/img/disease/heart/introduce/reason_3.jpg" alt="" class="img-left">
      <img src="@/assets/img/disease/heart/introduce/reason_4.jpg" alt="" class="img-right">
    </div>

    <div class="main-body">
      <h2 style="opacity: 0">占位符</h2>
      <h2>三.有哪些临床表现</h2>
      <p class="text">冠心病的临床表现主要为心肌缺血的两种急性表现。</p>
      <img src="@/assets/img/disease/heart/introduce/performance_1.jpg" alt="" class="img-left">
      <img src="@/assets/img/disease/heart/introduce/performance_2.jpg" alt="" class="img-right">
      <p class="text">心绞痛的临床表现主要是胸骨中上部压榨性疼痛，放射至左肩部，休息或服硝酸甘油可缓解，部分患者还有胸闷、气短等不典型症状；当患者发生胸痛时立即停止活动或舌下含服硝酸甘油，若服药后3～5分钟仍不缓解者，每隔5分钟可舌下含服1次，连续含服硝酸甘油3次仍不缓解，或心绞痛比以往发作频繁、程度加重、疼痛时间延长，应及时到医院就诊。心肌梗死的临床表现为胸痛症状持久而严重，休息或含服硝酸甘油不能缓解，多有伴随症状如发热、胃肠道症状、心律失常、心衰、休克等，应立即拨打急救电话，急诊入院，尽早进行溶栓或介入治疗。患者应定期复查心电图、血压、血糖、血脂、肝肾功能等，若发现异常应及时就诊。</p>
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "heartKnowledge",
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