<template>
  <div id="question-list">
    <nav-bar>
      <div slot="left" class="el-icon-arrow-left" @click="lastTick()"></div>
      <div slot="center">{{questionnaire.问卷名称}}</div>
    </nav-bar>
    <question-title>
      <span slot="name">{{questionnaire.问卷名称}}</span>
    </question-title>
    <question-item v-for="(item,index) in questions"
                   :question="item"
                   :user-answer="userAnswer[index]"
                   :answer-status="userQuestion.是否提交"
                   @itemClick="getAnswer(arguments)" v-if="flag"></question-item>
<!--                v-if 用于控制子组件创建的时机，保证父组件传递的参数不为空 -->
    <el-button class="subButton" @click="submit" v-if="subStatus">提交问卷</el-button>
    <div class="re-button" v-else>
      <el-button class="rewrite" @click="reWrite()">重新填写</el-button>
      <el-button class="result">结果分析</el-button>
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import questionTitle from "@/components/content/questionnaire/questionTitle";
  import questionItem from "@/components/content/questionnaire/questionItem";

  import {request} from "@/network/request";

  export default {
    name: "questionsList",
    components: {
      NavBar,
      questionTitle,
      questionItem
    },
    data() {
      return {
        questionnaire: {},
        userQuestion: {},
        questions: [],
        userAnswer: [],
        //用户提交的答案
        answers: [],
        quesNum: [],
        // 控制子组件创建的时机，保证可以拿到数据
        flag: false
      }
    },
    computed: {
      subStatus() {
        return this.userQuestion.是否提交 === '否'
      }
    },
    methods: {
      // 返回上一级
      lastTick() {
        this.$router.push('/questionnaire');
      },
      // 请求所有的问题
      getQuestions() {
        request({
          method: 'post',
          url: '/questions/getQuestions',
          data: {
            qNum: this.questionnaire.问卷编号
          }
        }).then(res => {
          this.questions = res.data;
        })
      },
      // 请求用户填写的答案
      getUserAnswer() {
        request({
          method: 'post',
          url: '/userAnswer/getUserA',
          data: {
            account: window.atob(this.$store.state.account),
            qNum: this.questionnaire.问卷编号
          }
        }).then(res => {
          res.data.forEach(item => {
            this.userAnswer[item.问题编号-1] = item;
          })
          this.flag = true;
        })
      },
      // 保存并整理数据格式
      getAnswer(msg) {
        let answer = msg[0];
        let index = msg[1];
        this.answers[index-1] = answer;
        this.quesNum[index-1] = index + '';
      },
      // 提交表单
      submit() {
        // 保证所有问题都已填写完毕
        if(this.answers.length === this.questions.length) {
          request({
            method: 'post',
            url: '/userAnswer/insertUserA',
            data: {
              account: window.atob(this.$store.state.account),
              qNum: this.questionnaire.问卷编号,
              quesNum: this.quesNum,
              answer: this.answers
            }
          }).then(res => {
            if(res.data) {
              this.$message({
                type: 'success',
                message: '提交成功'
              })
              this.userQuestion.是否提交 = "是"
              // 重新获取数据
              request({
                method: 'post',
                url: '/userAnswer/getUserA',
                data: {
                  account: window.atob(this.$store.state.account),
                  qNum: this.questionnaire.问卷编号,
                }
              }).then(res => {
                res.data.forEach(item => {
                  this.userAnswer[item.问题编号-1] = item;
                })
                // 控制子组件重新进行渲染，保证能够获取到父组件传递的参数
                this.flag = false;
                this.flag = true;
              })
            }
          })
        }
        else{
          this.$message({
            type: 'warning',
            message: '问卷未填写完毕',
          })
        }
      },
      // 重新填写
      reWrite() {
        this.$confirm('此操作清空之前填写的答案，是否继续？','警告',{
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          request({
            method: 'post',
            url: '/userAnswer/deleteUserA',
            data: {
              account: window.atob(this.$store.state.account),
              qNum: this.questionnaire.问卷编号
            }
          }).then(res => {
            if(res.data === true) {
              this.$message({
                type: 'success',
                message: '重置成功'
              })
              this.userQuestion.是否提交 = '否'
              this.userAnswer = [];
              this.answers.fill('0');
            }
          })
        }).catch(() => {
          this.$message({
            type: 'info',
            message: '已取消'
          });
        })
      }
    },
    created() {
      this.questionnaire = this.$route.query.questionnaire;
      this.userQuestion = this.$route.query.userQuestion;
      this.getQuestions();
      this.getUserAnswer();
      this.answers.fill('0')
    }
  }
</script>

<style scoped>
  #question-list {
    height: 100%;
  }
  .subButton {
    width: 90%;
    margin-left: 5%;
    margin-top: 3%;
    margin-bottom: 3%;
    background: #b3d8ff;
  }
  .re-button {
    margin-left: 30%;
  }
  .result,.rewrite {
    margin-top: 3%;
    margin-bottom: 3%;
    background: #b3d8ff;
  }
</style>