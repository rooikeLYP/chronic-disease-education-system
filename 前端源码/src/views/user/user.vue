<template>
  <div id="user">
    <nav-bar>
      <div slot="center">我的</div>
    </nav-bar>
    <div class="main-user">
      <main-user :img = "user.头像" :account="user.账号" :name="user.昵称" @itemClick="mainUserClick"></main-user>
      <div @click="dialogVisible = true">
        <setting>
          <span slot="setting-icon" class="el-icon-edit"></span>
          <span slot="setting-text">修改密码</span>
        </setting>
      </div>
      <div @click="quit">
        <setting>
          <span slot="setting-icon" class="el-icon-right"></span>
          <span slot="setting-text">退出登录</span>
        </setting>
      </div>
      <main-tabber></main-tabber>
      <!--     弹出密码修改框-->
      <el-dialog title="修改密码"
                 :visible="dialogVisible"
                 width="80%" class="dialog" @close="dialogVisible = false">
        <span>请输入旧密码</span>
        <el-input v-model="oldPwd" placeholder="请输入原密码"></el-input>
        <span>请输入新密码</span>
        <el-input v-model="newPwd" placeholder="请输入新密码"></el-input>
        <span slot="footer" class="dialog-footer">
          <el-button @click="dialogVisible = false">取 消</el-button>
          <el-button type="primary" @click="changePwd(oldPwd, newPwd)">确 定</el-button>
        </span>
      </el-dialog>
    </div>
  </div>
</template>

<script>
  import NavBar from "@/components/common/navbar/NavBar";
  import mainTabber from '@/components/content/mainTabber/main-tabber'
  import MainUser from "@/components/content/mainUser/mainUser";
  import Setting from "@/components/content/settings/setting";

  import {request} from "@/network/request";
  import {getUserData} from "@/network/login";

  export default {
    name: "user",
    components: {
      Setting,
      MainUser,
      NavBar,
      mainTabber,
    },
    data() {
      return {
        user: {
          type: Object,
          default: {}
        },
        dialogVisible: false,
        oldPwd: '',
        newPwd: '',
      }
    },
    methods: {
      getUser(account) {
        getUserData(account).then(res => {
          this.user = res.data;
        })
      },
      mainUserClick() {
        this.$router.push('/user-detail');
      },
      changePwd(oldPwd, newPwd) {
        if(oldPwd === window.atob(this.$store.state.pwd) && newPwd !== '' && oldPwd !== newPwd) {
          request({
            method: 'post',
            url: '/users/changePwd',
            data: {
              oldPwd,
              newPwd,
              account: window.atob(this.$store.state.account)
            }
          }).then(res => {
            if(res.data === true) {
              this.$message({
                type: 'success',
                message: '修改成功',
              })
              this.dialogVisible = false;
              this.$store.commit('setPwd',window.btoa(newPwd))
            }
          })
        }
        else if(oldPwd !== window.atob(this.$store.state.pwd)) {
          this.$message({
            type: 'error',
            message: '原密码错误',
          })
        }
        else if(newPwd === ''){
          this.$message({
            type: 'error',
            message: '新密码不能为空',
          })
        }
        else {
          this.$message({
            type: 'error',
            message: '新密码不能和原密码相同',
          })
        }
      },
      quit() {
        this.$confirm("确定退出吗？", "提示", {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          // customClass: 'msgbox',
          type: 'warning'
        }).then(() => {
          this.$message({
            type: 'success',
            message: '退出成功',
          });
          this.$router.replace('/');
        }).catch(() => {
          this.$message({
            type: 'info',
            message: '已取消'
          });
        })
      }
    },
    created() {
      this.getUser(window.atob(this.$store.state.account));
    }
  }
</script>

<style scoped>
  .dialog span{
    font-size: 20px;
  }
  .msClass {
    width: 100px;
  }
  .main-user {
    margin-top: 44px;
  }
</style>