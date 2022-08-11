<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">保持气管畅通的常用方法</span>
    </nav-bar>
    <div class="main-body">
      <h2>一.有效咳痰技巧</h2>
      <p class="text">1.采取坐位，双手重叠置于上腹部</p>
      <p class="text">2.缓慢深吸气，吸气末梢做屏气</p>
      <p class="text">3.用力咳嗽的同时身体前倾</p>
      <p class="text">4.咳嗽的同时腹肌用力收缩使腹部内陷，双手适当的按压上腹部</p>
      <p class="text">5.稍作休息重复上述动作 </p>
      <p class="text">（也可让病人取俯卧屈膝位，借助膈肌、腹肌收缩，增加腹压，咳出痰液）</p>
      <img src="@/assets/img/disease/lung/methods/methods_1.png" alt="" class="img">
    </div>
    <div class="main-body">
      <h2>二.胸部叩击</h2>
      <p class="text">1.使病人侧卧位或在协助下取坐位</p>
      <p class="text">2.两手手指弯曲并拢，使掌侧呈杯状</p>
      <p class="text">3.以手腕力量，从肺底自下而上、由外向内、迅速而有节律地叩击胸壁每一肺叶叩击1～3分钟，叩击时发出一种空而深的拍击音则表明叩击手法正确。</p>
      <img src="@/assets/img/disease/lung/methods/methods_2.jpg" alt="" class="img" style="height: 250px">
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "lungMethods",
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