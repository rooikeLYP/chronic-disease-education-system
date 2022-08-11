<template>
  <div id="main">
    <nav-bar>
      <span class="el-icon-arrow-left" slot="left" @click="lastTick()"></span>
      <span slot="center">运动指导</span>
    </nav-bar>
    <div class="main-body">
      <h2>一.太极拳</h2>
      <p class="text">1）起势:向左开步 双臂平提 屈膝下按</p>
      <p class="text">2）左右野马分鬃:丁步右抱 转身上步 弓步分掌 后坐撇脚 丁步左抱 转身上步 弓步右分 后坐撇脚 丁步右抱 转身上步 弓步左分</p>
      <p class="text">3）白鹤亮翅:跟步中抱 后坐右转 虚步亮掌</p>
      <p class="text">4）左右搂膝拗步:右落左拨 丁步反提 弯肘上步 搂膝推掌 后坐撇脚 丁步反提 弯肘上步 搂膝推掌 后坐撇脚 丁步反提 弯肘上步 搂膝推掌</p>
      <p class="text">5）手挥琵琶:跟前半步 后坐转腰 虚步合手</p>
      <p class="text">6）左右倒转肱:右后摆掌 提膝弯肘 左退右推 左后摆掌 提膝弯肘 右退左推 右后摆掌 提膝弯肘 左退右推 左后摆掌 提膝弯肘 右退左推</p>
      <p class="text">7）左揽雀尾:丁步右抱 转身上步 弓步左棚 向左伸展 后坐右捋 转腰搭臂 弓步前挤 后坐拖掌 弓步双推 后坐扣脚 丁步左抱 转身上步</p>
      <p class="text">8）右揽雀尾:后坐扣脚 丁步左抱 转身上步 弓步右棚 向右伸展 后坐左捋 转腰搭臂 弓步前挤 后坐拖掌 弓步双推</p>
      <p class="text">9）单鞭:后坐扣脚 左转按捋 反掌右转 丁步勾手 转身上步 弓步推掌</p>
      <p class="text">10）云手:后坐摆掌 右转左扣 左转收步 右转撤步 左转收步 右转撤步 左转收步</p>
      <p class="text">11)单鞭:反掌右云 丁步勾手 转身上步 弓步推掌</p>
      <p class="text">12)高探马:跟步仰掌 虚步推掌</p>
      <p class="text">13)右蹬脚:穿掌收脚 上步开掌 丁步叉抱 提膝反掌 开掌蹬脚</p>
      <p class="text">14)双峰贯耳:收脚并掌 落步垂手 弓步贯拳</p>
      <p class="text">15)左蹬脚:后坐扣脚 左转开掌 丁步叉抱 提膝反掌 开掌蹬脚</p>
      <p class="text">16)左下势独立：收腿勾手 仆步穿掌 撩掌勾手 提膝挑掌</p>
      <p class="text">17)右下势独立：右脚点地 左转勾手 仆步穿掌 撩掌勾手 提膝挑掌</p>
      <p class="text">18)左右穿梭：左转落步 丁步左抱 右转上步 右架左推 后坐翘脚 丁步右抱 左转上步 左架右推</p>
      <p class="text">19)海底针：跟步按掌 提膝抽掌 虚步插掌</p>
      <p class="text">20)闪通臂:上步提手 右架左推</p>
      <p class="text">21)转身搬拦捶:后坐扣脚 右转摆掌 丁步抱拳 圈脚搬拳 上步拦掌 弓步冲拳</p>
      <p class="text">22)如封似闭：后坐拖手 弓步双推</p>
      <p class="text">23)十字手：后坐扣脚 右转开掌 收步叉抱</p>
      <p class="text">24)收势：立身两掌下按 收左脚还原</p>
      <video width="100%" height="40%" src="@/assets/video/lung/太极拳视频.mp4" controls></video>
    </div>
    <div class="main-body">
      <h2>二.上肢肌力训练</h2>
      <p class="text">骨骼肌肉萎缩是慢阻肺患者的常见症状，尤其是上肢和下肢，加强上下肢肌肉训练很重要。根据自身情况选择适宜的锻炼方式，如散步、慢跑、游泳、太极拳等。肌肉训练的基本原则：心率增快最高控制在静息状态下的1.2～1.5倍水平，呼吸频率最高控制不超过30次/分，外周血氧饱和度不低于90％。</p>
      <img src="@/assets/img/disease/lung/sport/sport_1.jpg" alt="" class="img">
      <p class="text">1.上肢训练：如无负重上肢训练，即平静呼吸下双肩重复前屈和外展，通过减轻肋间吸气肌的通气负担，转换成膈肌或者辅助呼吸肌做功进而提高肺功能。要循序渐进的提高运动频率、时间以及运动强度等，有能力的患者也可以采用轻举过头或手臂负重上举等运动。</p>
      <img src="@/assets/img/disease/lung/sport/sport_2.jpg" alt="" class="img">
      <p class="text">2.下肢训练：如平地快步行走，这项运动完全由患者自己把握，在身体能接受的程度内，自己调节行走的距离和速度。这种方法相对安全，简单方便，容易接受。应坚持持之以恒、量力而行的原则。</p>
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";

  export default {
    name: "lungSport",
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