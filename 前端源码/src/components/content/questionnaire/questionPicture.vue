<template>
  <div id="question-picture">
    <div class="main-picture">
      <img src="@/assets/img/questionnaire/main-questionnaire.jpg" alt="">
      <div class="picture-word">
        <span slot="disease-name" class="disease-name">问卷评估</span>
      </div>
    </div>
  </div>
</template>

<script>

  export default {
    name: "question-picture"
  }
</script>

<style scoped>
  #question-picture {
    width: 85%;
    height: 40%;
    margin-left: 8%;
    margin-top: 54px;
  }
  .main-picture {
    height: 100%;
    background: white;
  }
  img {
    width: 100%;
    height: 15rem;
    border-bottom: 1px solid silver;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;
  }
  .picture-word {
    height: 50px;
    background: white;
    border-bottom-left-radius: 10px;
    border-bottom-right-radius: 10px;
  }
  .picture-word span {
    color: #606266;
    font-size: 22px;
    line-height: 50px;
    margin-left: 3%;
  }
</style>