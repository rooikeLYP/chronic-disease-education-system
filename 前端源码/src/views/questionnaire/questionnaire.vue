<template>
  <div id="questionnaire">
    <nav-bar><div slot="center">问卷评估</div></nav-bar>
    <main-questionnaire></main-questionnaire>
    <main-tabber></main-tabber>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import mainTabber from '@/components/content/mainTabber/main-tabber'
  import mainQuestionnaire from "@/components/content/questionnaire/mainQuestionnaire";

  export default {
    name: "questionnaire",
    components: {
      NavBar,
      mainTabber,
      mainQuestionnaire
    }
  }
</script>

<style scoped>

</style>