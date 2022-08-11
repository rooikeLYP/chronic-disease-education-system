<template>
  <div id="user-detail">
    <nav-bar>
      <div slot="left" class="el-icon-arrow-left" @click="lastTick"></div>
      <div slot="center">个人信息</div>
    </nav-bar>
    <div class="user-message">
      <upload class="upload"></upload>
      <setting class="user-setting">
        <span slot="setting-icon">头像</span>
        <img v-if="img" :src="img" slot="setting-picture" alt="">
        <img v-else :src="require('@/assets/img/'+ imgPath)" slot="setting-picture" alt="">
      </setting>
      <div @click=" dialogVisible = true">
        <setting class="user-setting" >
          <span slot="setting-icon" >昵称</span>
          <span slot="setting-text" class="user-name">{{userName}}</span>
        </setting>
      </div>
    </div>
    <!-- 弹出修改框 -->
    <el-dialog title="修改昵称"
               :visible="dialogVisible"
               width="70%" @close = "dialogVisible = false">
      <span>请输入新昵称</span>
      <el-input v-model="userName" placeholder="请输入新昵称"></el-input>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="changeName">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import Setting from "@/components/content/settings/setting";
  import upload from "@/views/user/user-detail/upload"

  import {request} from "@/network/request";
  import {getUserData} from "@/network/login";

  export default {
    name: "user-detail",
    components: {
      Setting,
      NavBar,
      upload
    },
    data() {
      return {
        dialogVisible: false,
        img: {
          type: String,
          default: ''
        },
        userName: String,
      }
    },
    methods: {
      changeName() {
        if(this.userName !== this.$route.query.name && this.userName !== '') {
          request({
            method: 'post',
            url: '/users/changeName',
            data: {
              newName: this.userName,
              account: window.atob(this.$store.state.account)
            }
          }).then(res => {
            if(res.data === true){
              this.$message({
                type: 'success',
                message: '修改成功'
              });
              this.dialogVisible = false;
            }
          })

       }
        else if(this.userName === this.$route.query.name) {
          this.$message({
            type: 'error',
            message: '输入的昵称未发生改变'
          });
        }
        else if(this.userName === '') {
          this.$message({
            type: 'error',
            message: "输入为空！"
          });
        }
      },
      getUser(account) {
        getUserData(account).then(res => {
          this.img = res.data.头像;
          this.userName = res.data.昵称;
        })
      },
      lastTick() {
        this.$router.push('/user')
      },
    },
    computed: {
      imgPath() {
        let str = ('@/assets/img/users/default/default.jpg').split('/');
        str.splice(0,3);
        return str.join('/')
      }
    },
    created() {
      this.getUser(window.atob(this.$store.state.account));
    }
  }
</script>

<style scoped>
  #user-detail {
    position: relative;
  }
  .user-message {
    margin-top: 44px;
  }
  .user-setting{
    margin-top: 1px;
  }
  img {
    position: absolute;
    left: 75%;
    width: 50px;
    height: 50px;
  }

  .user-name {
    position: relative;
    left: 55%;
  }
  .upload {
    width: 100%;
    height: 70px;
    position: absolute;
    z-index: 9;
    opacity: 0;
  }
</style>