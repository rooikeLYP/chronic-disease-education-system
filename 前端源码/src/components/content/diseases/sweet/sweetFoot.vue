<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">低血糖反应</span>
    </nav-bar>
    <div class="main-body">
      <video width="100%" height="40%" src="@/assets/video/sweet/糖尿病足的预防.mp4" controls></video>
      <h2>糖尿病足的预防及护理</h2>
      <p class="text">（1）每天检查足部：注意观察足部有无颜色、温度改变及足背动脉搏动情况，注意足部有无感觉减退、麻木、刺痛感；尤其注意检查足部有无皮肤破损，如水疱、裂口、红肿、胼胝、鸡眼等；避免自行修剪胼胝或用化学制剂来处理胼胝或趾甲。</p>
      <p class="text">（2）养成每日用温水洗脚的习惯：水温一般控制在40℃左右，时间以10～15分钟为宜。洗脚前用手腕掌部测试水温，若已对温度不太敏感者，请家人代试水温，洗完后用柔软的毛巾擦干，尤其是脚趾间。若足部皮肤干燥，可涂润肤乳，保持足部皮肤润滑，防止发生皲裂。</p>
      <p class="text">（3）选择合适的鞋袜：最好选择透气好的纯棉浅色的袜子，袜口不要太紧，以免影响血液循环。若袜子有破损，尽量更换新的，不要修补后再穿，因为修补后的部位不平整，长期摩擦，易引起足部损伤，鞋子最好也选择透气性好的棉质布鞋，不宜穿露脚趾的凉鞋，不宜穿鞋跟过高或鞋头过尖的，鞋底要平、厚，鞋子大小合适，才能保护足部避免磨损或外伤。</p>
      <p class="text">（4）预防外伤： 糖尿病患者由于足部感觉异常，容易受到创伤，若合并血管病变，破损的伤口不易愈合。因此不宜赤脚走路，外出时不宜穿拖鞋，穿鞋前先检查鞋内有无异物。冬天应注意足部保暖，预防冻伤，但避免使用热水袋、火炉等给足部取暖，防止烫伤，夏天注意避免蚊虫叮咬。</p>
      <img src="@/assets/img/disease/sweet/foot/foot.png" alt="" class="img" />
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import '@/assets/css/main.css'
  export default {
    name: "sweetFoot",
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

</style>