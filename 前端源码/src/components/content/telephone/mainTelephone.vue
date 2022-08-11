<template>
  <div id="main-telephone">
    <nav-bar>
      <div slot="left" class="el-icon-arrow-left" @click="lastTick()"></div>
      <div slot="center">紧急联系人</div>
      <div slot="right" class="el-icon-delete" @click="deleteTelephone()"></div>
    </nav-bar>
    <div class="main-telephone">
      <van-contact-list
              v-model="chosenContactId"
              :list="telephone"
              default-tag-text="默认"
              @add="onAdd"
              @edit="onEdit"
              @select="onSelect"
      />
    </div>
    <el-dialog title="新建联系人" :visible="dialogVisible" @close="dialogVisible = false" width="80%">
      <label class="tel-input">
        <span class="clock-span">姓名</span>
        <input class="input" v-model="editingContact.name"></input>
      </label>
      <label class="tel-input">
        <span class="clock-span">电话</span>
        <input class="input" v-model="editingContact.tel"></input>
      </label>
      <label class="tel-input">
        <span class="clock-span">设为默认联系人</span>
        <el-switch v-model="editingContact.isDefault"></el-switch><br>
        <el-button type="primary" class="save" @click="onSave(editingContact)" plain>保存</el-button>
        <el-button class="release" @click="dialogVisible = false" plain>取消</el-button>
      </label>
    </el-dialog>

    <el-dialog title="修改联系人" :visible="updateDialog" @close="updateDialog = false" width="80%">
      <label class="tel-input">
        <span class="clock-span">姓名</span>
        <input class="input" v-model="updateContact.name"></input>
      </label>
      <label class="tel-input">
        <span class="clock-span">电话</span>
        <input class="input" v-model="updateContact.tel"></input>
      </label>
      <label class="tel-input">
        <span class="clock-span">设为默认联系人</span>
        <el-switch v-model="updateContact.isDefault"></el-switch><br>
        <el-button type="primary" class="save" @click="onUpdate(updateContact)" plain>保存</el-button>
        <el-button class="release" @click="updateDialog = false" plain>取消</el-button>
      </label>
    </el-dialog>

  </div>
</template>

<script>
  import 'vant/lib/index.css'
  import NavBar from "@/components/common/navbar/NavBar";

  import {request} from "@/network/request";
  export default {
    name: "mainTelephone",
    components: {NavBar},
    data() {
      return {
        // 所有的联系人信息
        telephone: [],
        // 被选中的联系人编号
        chosenContactId: "",
        chosenContactIndex: "",
        // 控制新建联系人对话框
        dialogVisible: false,
        // 控制修改联系人对话框
        updateDialog: false,
        // 存储新建联系人相关信息
        editingContact: {
          name: null,
          tel: null,
          isDefault: null,
        },
        // 存储修改联系人相关信息
        updateContact: {}
      }
    },
    methods: {
      lastTick(){
        this.$router.push('/tools');
      },
      getTelephone() {
        request({
          url: '/telephone/getTelephone',
          method: 'post',
          data: {
            account: window.atob(this.$store.state.account)
          }
        }).then(res => {
          res.data.forEach((item,index) => {
            let obj = {};
            obj.id = item.家属编号;
            obj.index = index
            obj.name = item.名称;
            obj.tel = item.家属电话;
            if(item.是否默认 === '1') obj.isDefault = true;
            this.telephone.push(obj);
          })
          // this.telephone = res.data;
        })
      },
      onDelete() {
        this.dialogVisible = false;
        this.updateDialog = false;
      },
      onAdd() {
        this.dialogVisible = true;
      },
      onEdit() {
        this.updateDialog = true;
      },
      onSave(content) {
        // 手机号的正则表达式
        let reg = /^1(3[0-9]|5[0-3,5-9]|7[1-3,5-8]|8[0-9])\d{8}$/;
        if(content.name === '' || content.name === null){
          this.$message({
            type: 'error',
            message: '请输入联系人姓名',
          })
        }
        else if(content.tel === null) {
          this.$message({
            type: 'error',
            message: '请输入手机号',
          })
        }else if(content.tel.length !== 11 || !reg.test(content.tel)) {
          this.$message({
            type: 'error',
            message: '手机号格式错误',
          })
        }
        else {
          request({
            url: '/telephone/addTelephone',
            method: 'post',
            data: {
              account: window.atob(this.$store.state.account),
              name: content.name,
              telephone: content.tel,
              isDefault: content.isDefault
            }
          }).then(res => {
            if(res.data === true) {
              this.dialogVisible = false;
              this.$message({
                type: "success",
                message: '添加成功'
              })
              this.telephone = [];
              this.getTelephone();
            }
          })
        }

      },
      deleteTelephone() {
        if(this.chosenContactId !== ''){
          this.$confirm('是否删除该联系人','警告',{
            confirmButtonText: '确定',
            cancelButtonText: '取消',
            type: 'warning'
          }).then(() => {
            request({
              url: '/telephone/deleteTelephone',
              method: 'post',
              data: {
                num: this.chosenContactId
              }
            }).then(res => {
              if(res.data === true) {
                this.$message({
                  type: 'success',
                  message: '删除成功'
                })
                this.telephone = [];
                this.getTelephone();
              }
            })
          })
        }
        else {
          this.$message({
            type: 'error',
            message: '请选择要删除的联系人'
          })
        }
      },
      onUpdate(content) {
        let reg = /^1(3[0-9]|5[0-3,5-9]|7[1-3,5-8]|8[0-9])\d{8}$/;
        if(content.name === '' || content.name === null){
          this.$message({
            type: 'error',
            message: '请输入联系人姓名',
          })
        }
        else if(content.tel === null) {
          this.$message({
            type: 'error',
            message: '请输入手机号',
          })
        }else if(content.tel.length !== 11 || !reg.test(content.tel)) {
          this.$message({
            type: 'error',
            message: '手机号格式错误',
          })
        }else {
          request({
            url: '/telephone/updateTelephone',
            method: 'post',
            data: {
              num: this.chosenContactId,
              account: window.atob(this.$store.state.account),
              name: content.name,
              telephone: content.tel,
              isDefault: content.isDefault
            }
          }).then(res => {
            if(res.data === true) {
              this.updateDialog = false;
              this.$message({
                type: "success",
                message: '修改成功'
              })
              this.telephone = [];
              this.getTelephone();
            }
          })
        }

      },
      onSelect(contact) {
        this.chosenContactIndex = contact.index;
        this.updateContact = this.telephone[this.chosenContactIndex]
      }
    },
    created() {
      this.getTelephone();
    }
  }
</script>

<style scoped>
  #main-telephone{
    height: 100vh;
  }
  .main-telephone {
    margin-top: 44px;
  }
  .van-button {
    background: cornflowerblue;
    border: 1px solid cornflowerblue;
  }
  .tel-input {
    display: inline-block;
    margin-left: 20px;
    padding-bottom: 5px;
    height: 30px;
    line-height: 30px;
    margin-bottom: 5%;
  }
  .input {
    display: inline-block;
    width: 80%;
    height: 30px;
    margin-left: 5px;
    border: 0;
    border-bottom: 1px solid rgba(100,100,100,0.1);
  }
  .el-switch {
    margin-left: 30px;
  }
  .save, .release {
    margin-top: 50px;
    display: inline-block;
    width: 100px;
  }
</style>