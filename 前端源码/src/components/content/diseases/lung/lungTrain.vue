<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">肺康复训练</span>
    </nav-bar>
    <div class="main-body">
      <h2>肺康复训练的方法</h2>
      <p class="text">慢阻肺治疗的一个重要目标是保持患者良好的肺功能，只有保持良好的肺功能才能使患者有较好的活动能力和良好的生活质量。因此呼吸功能锻炼非常重要，患者可通过做缩唇呼吸、腹式呼吸、呼吸瑜珈、呼吸操、唱歌、吹口哨、吹笛子等进行呼吸功能锻炼。目的是以缓慢的深呼吸增加肺泡通气、提高呼吸效率、维持适当气体交换和缓解呼吸困难。目前最常用的技术是缩唇呼吸、腹式呼吸和呼吸操。</p>
      <h3>1.缩唇式呼吸</h3>
      <p class="text">1.患者闭嘴经鼻吸气</p>
      <p class="text">2.通过缩唇（吹口哨样）缓慢呼气，同时收缩腹部。</p>
      <p class="text">注：吸气与呼气的时间比值1：2或1：3 每日训练2～3次，每次10～15分钟</p>
      <video width="100%" height="40%" src="@/assets/video/lung/缩唇呼吸视频.mp4" controls></video>
      <h3>2.腹式呼吸</h3>
      <p class="text">1.取卧位、半卧位或坐位</p>
      <p class="text">2.将两手分别放在胸部和腹部，全身肌肉放松，平静呼吸</p>
      <p class="text">3.闭嘴用鼻缓慢吸气，膈肌最大程度下降，腹部凸出，手感到腹部向上抬起</p>
      <p class="text">4.经口缓慢呼气，腹肌收缩，膈肌松弛，手感到腹部下降</p>
      <p class="text">注：每日训练2～3次，每次10～15分钟</p>
      <video width="100%" height="40%" src="@/assets/video/lung/腹式呼吸视频.mp4" controls></video>
      <h3>3.呼吸操</h3>
      <p class="text">通过做呼吸操可以锻炼呼吸功能，增加呼吸量，在做呼吸操锻炼时，一定要放松全身肌肉，而且动作要优化而快，不能够操之过急，呼吸操的锻炼方法如下：
        方法与步骤：</p>
      <p class="text">第一节：缩唇呼吸</p>
      <p class="text">双脚分开与肩同宽，用鼻子吸气，屏气（1.2），缩唇做口哨样，缓慢呼气，还原</p>
      <p class="text">第二节：腹式呼吸</p>
      <p class="text">双脚分开与肩同宽，左手放在胸部，右手放在腹部，用鼻子吸气，腹部膨出，屏气（1.2），缩唇呼气（1.2.3.4）腹部下沉，还原</p>
      <p class="text">第三节：侧头二转</p>
      <p class="text">双脚分开与肩同宽，双手叉腰，吸气（1.2），向左转头，呼气（1.2.3.4），回头吸气（1.2），向右转头，呼气（1.2.3.4），还原</p>
      <p class="text">第四节：运转乾坤</p>
      <p class="text">双脚分开与肩同宽，双手搭肩，向外展开，吸气（1.2），向内收拢，呼气（1.2.3.4），还原</p>
      <p class="text">第五节：指点迷津</p>
      <p class="text">双脚分开与肩同宽，双手叉腰，右脚前移半步，吸气（1.2），左脚收回，呼气（1.2.3.4），右脚前移半步，呼气（1.2），右脚收回，呼气（1.2.3.4）
        第六节：鞠躬尽瘁</p>
      <p class="text">第六节：鞠躬尽瘁</p>
      <p class="text">双脚分开与肩同宽，双手叉腰,吸气(1.2)，轻轻收腹弯腰,(边呼气边弯腰)呼气(1.2.3.4)，还原</p>
      <p class="text">第七节：单臂上举吸气，双手放于腹部呼气</p>
      <p class="text">双脚分开与肩同宽，左手单臂上举，吸气（1.2），双手放于腹部，呼气（1.2.3.4），右手单臂上举，吸气（1.2），双手放于腹部，呼气（1.2.3.4），还原</p>
      <p class="text">第八节：双臂侧平举吸气，垂臂呼气</p>
      <p class="text">双脚分开与肩同宽，双臂侧平举，吸气（1.2），垂臂,呼气(1.2.3.4),还原</p>
      <video width="100%" height="40%" src="@/assets/video/lung/呼吸操视频.mp4" controls></video>
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "lungTrain",
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