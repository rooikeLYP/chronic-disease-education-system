<template>
  <div id="question-item">
    <div class="question">
      <span>{{question.问题编号}}.</span>
      <span>{{question.问题}}</span>
      <span class="el-icon-circle-check" :style="titleColor"></span>
    </div>
    <div class="answer">
      <ul class="radio-list">
        <van-radio-group v-model="answer" @change="itemClick()" v-if="answerStatus === '否'">
          <li>
            <van-radio name="A">{{question.a}}</van-radio>
          </li>
          <li>
            <van-radio name="B">{{question.b}}</van-radio>
          </li>
          <li>
            <van-radio name="C">{{question.c}}</van-radio>
          </li>
          <li>
            <van-radio name="D">{{question.d}}</van-radio>
          </li>
        </van-radio-group>
        <van-radio-group v-model="userAnswer.答案" class="radio-group" @change="itemClick()" v-else disabled>
          <li>
            <van-radio name="A">{{question.a}}</van-radio>
          </li>
          <li>
            <van-radio name="B">{{question.b}}</van-radio>
          </li>
          <li>
            <van-radio name="C">{{question.c}}</van-radio>
          </li>
          <li>
            <van-radio name="D">{{question.d}}</van-radio>
          </li>
        </van-radio-group>
      </ul>
    </div>
  </div>
</template>

<script>
  export default {
    name: "questionItem",
    props: {
      // 保存问卷的问题
      question: {
        type: Object,
        default: {}
      },
      // 保存用户填写的答案
      userAnswer: {
        type: Object,
        default: {}
      },
      // 保存用户答案的状态，用于判断问卷是否可填
      answerStatus: {
        type: String,
        default: ''
      }
    },
    data() {
      return {
        // 保存用户填写的答案
        answer: {
          type: String,
          default: null
        }
      }
    },
    computed: {
      // 动态修改右上角图标的颜色
      titleColor() {
        if(this.answer.length !== undefined || this.userAnswer.答案 !== undefined)
          return "color: white; background:cornflowerblue;"
      }
    },
    methods: {
      // 点击事件
      itemClick() {
        this.$emit('itemClick',this.answer,this.question.问题编号)
      }
    }
  }
</script>

<style scoped>
  #question-item {
    height: 30%;
    width: 96%;
    margin-left: 2%;
    margin-top: 3%;
    background: white;
    border-radius: 10px;
    color: #606266;
  }
  .question {
    position: relative;
    font-size: 16px;
    padding: 3%;
  }
  .el-icon-circle-check {
    position: absolute;
    left: 90%;
    font-size: 16px;
  }
  .answer {
    padding-left: 7%;
    padding-bottom: 5%;
  }
  .answer span {
    line-height: 25px;
    padding-left: 2%;
  }
  .radio-list li {
    margin-bottom: 3%;
  }
  .el-icon-circle-check {
    border-radius: 100%;
  }
</style>