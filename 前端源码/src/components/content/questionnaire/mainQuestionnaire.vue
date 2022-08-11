<template>
  <div id="main-questionnaire">
    <question-picture></question-picture>
    <div class="question-list">
      <questionnaire-item v-for="(item,index) in questionnaire" :questionnaire="item" :user-question="userQuestion[index]" @itemClick="questionsList(index)"></questionnaire-item>
    </div>
  </div>
</template>

<script>
  import questionPicture from "@/components/content/questionnaire/questionPicture";
  import questionnaireItem from "@/components/content/questionnaire/questionnaireItem";
  import {request} from "@/network/request";

  export default {
    name: "mainQuestionnaire",
    components: {
      questionPicture,
      questionnaireItem
    },
    data() {
      return {
        questionnaire: [],
        userQuestion: []
      }
    },
    methods: {
      getQuestionnaire() {
        request({
          method: 'post',
          url: '/questionnaire/getQuestionnaire',
        }).then(res => {
          this.questionnaire = res.data;
          this.questionnaire.forEach(item => {
            this.getQuestions(item.问卷编号)
          })
        })
      },
      getQuestions() {
        request({
          method: 'post',
          url: '/userQuestion/getUserQ',
          data: {
            account: window.atob(this.$store.state.account)
          }
        }).then(res => {
          this.userQuestion.push(res.data)
        })
      },
      questionsList(index) {
        this.$router.push({
          path: '/questionsList',
          query: {
            questionnaire: this.questionnaire[index],
            userQuestion: this.userQuestion[index][0]
          }
        })
      }
    },
    created() {
      this.getQuestionnaire();
    }
  }
</script>

<style scoped>
  #main-questionnaire {
    height: 100vh;
  }
  .question-list {
    margin-top: 17%;
  }
</style>