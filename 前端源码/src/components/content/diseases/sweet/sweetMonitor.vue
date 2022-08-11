<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">病情监测</span>
    </nav-bar>
    <div class="main-body">
      <div class="monitor-sugar">
        <h2>一.测血糖</h2>
        <p class="text">血糖测定的方法有静脉血浆葡萄糖测定、毛细血管血葡萄糖测定和24小时动态血糖测定3种。前者用于诊断糖尿病，后两种仅用于糖尿病的监测。24小时动态血糖测定是指通过葡萄糖感应器监测皮下组织间液的葡萄糖浓度而反映血糖水平的监测技术，可以提供全面、连续、可靠的全天血糖信息，了解血糖波动的趋势，发现不易被传统监测方法所测得的高血糖和低血糖。常规监测血糖为毛细血管血葡萄糖的测定。</p>
        <b>测血糖的操作流程：</b>
        <p class="text">（1）选择手指：测血糖以中指和第四指侧面最为常用，这两个手指使用的频率较低，表皮厚度较薄，而且神经感觉不会特别灵敏，比其他几个手指疼痛感略轻；</p>
        <p class="text">（2）安装试纸：把试纸条安装到血糖仪装试纸条的部分，注意不能装反，安装正确时血糖仪的表面仪表上，出现可以待测量的提示；</p>
        <p class="text">（3）采血：把准备好的棉签和酒精拿到手边，采血针准备好，有一次性弹跳式采血针，也有需要装采血笔的采血针，根据实际情况进行准备。准备之后，手指的侧面进行酒精的消毒，不要使用络合碘消毒，因为络合碘消毒会使血糖值发生明显改变；</p>
        <p class="text">（4）虹吸：扎了以后第一滴血用棉签剔除不要，第一滴血可能混合有酒精会稀释血液，测出来的值不是很准确，可以进行轻度的挤压之后，出来的第二滴血，用已经安装好试纸条的血糖仪，在试纸条的采血端，通过虹吸的效应，把这滴血吸入试纸条上面，把血糖仪进行平放，等待几秒钟后可以读出读数。测完以后，还需要用棉签压迫止血，对棉签进行合理处理。</p>
        <video width="100%" height="40%" src="@/assets/video/sweet/测血糖.mp4" controls></video>
      </div>
      <div class="monitor-A1">
        <h2>二.糖化血红蛋白A1测定</h2>
        <p class="text">测定HbA1可反映取血前8～12周血糖的平均水平，而常规血糖测定只反映瞬时血糖值，因此HbA1成为糖尿病病情控制的监测指标之一。</p>
      </div>
      <div class="monitor-body">
        <h2>三.定期体检</h2>
        <p class="text">有糖尿病前期史、超重或肥胖、一级亲属有糖尿病、妊娠糖尿病史、多囊卵巢综合征、年龄≥40岁、缺乏体力活动、长期应用类固醇药物或抗精神病类药物者易患糖尿病。这些高危人群除了建立良好的生活习惯外，还要及早筛查，定期监测，做到早发现、早诊断、早治疗，及早严格控制血糖，降低糖尿病并发症的发生。</p>
      </div>
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  export default {
    name: "sweetMonitor",
    components: {
      NavBar
    },
    methods: {
      lastTick() {
        this.$router.push('/sweet')
      }
    }
  }
</script>

<style scoped>
  #sweet-monitor {
    background: white;
    font-family: 宋体;
  }
  .main-monitor {
    margin-top: 44px;
    padding: 3%
  }
  .monitor-text {
    text-indent: 2rem;
    line-height: 30px;
  }
  .monitor-sugar, .monitor-A1 {
    padding: 3%;
  }
</style>