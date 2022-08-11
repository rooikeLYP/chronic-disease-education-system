<template>
  <div id="main-tabber">
    <tab-ber>
      <tab-ber-item path="/home">
        <div slot="item-icon" class="el-icon-house"></div>
        <div slot="item-text">首页</div>
      </tab-ber-item>
      <tab-ber-item path="/tools">
        <div slot="item-icon" class="el-icon-menu"></div>
        <div slot="item-text">实用小工具</div>
      </tab-ber-item>
      <tab-ber-item path="/questionnaire">
        <div slot="item-icon" class="el-icon-document"></div>
        <div slot="item-text">问卷评估</div>
      </tab-ber-item>
      <tab-ber-item path="/user">
        <div slot="item-icon" class="el-icon-s-custom"></div>
        <div slot="item-text">我的</div>
      </tab-ber-item>
    </tab-ber>
  </div>
</template>

<script>
  import TabBerItem from "@/components/common/tabber/TabBerItem";
  import TabBer from "@/components/common/tabber/TabBer";
  export default {
    name: "mainTabber",
    components: {TabBer, TabBerItem}
  }
</script>

<style scoped>

</style>