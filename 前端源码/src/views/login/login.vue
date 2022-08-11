<template>
  <div id="login">
    <div class="login-dialog">
      <p>
      <input placeholder="请输入手机号"
             id="account"
             type="number"
             v-model="account"
             @click="show = true"
      ></input>
      <input v-model="pwd"
             id="pwd"
             placeholder="请输入密码"
             type="password"
             @click="show = true"
      ></input>
      </p>
      <el-button type="primary" id="login-button" @click="mLogin">登录</el-button>
      <span class="login-text" @click="register">没有账号？| &nbsp;注册</span>
    </div>
  </div>
</template>

<script>
  import {login} from "@/network/login";

  export default {
    name: "login",
    data() {
      return {
        account: '',
        pwd: '',
        show: false,
      }
    },
    methods: {
      mLogin() {
        let reg = /^1(3[0-9]|5[0-3,5-9]|7[1-3,5-8]|8[0-9])\d{8}$/;
        if(this.account === '') this.$message('请输入账号');
        else if(this.pwd === '') this.$message('请输入密码');
        else{
          if(this.account.length !== 11 || !reg.test(this.account)) {
            this.$message({
              type: 'error',
              message: '账号错误，请重新输入'
            })
          }
          else {
            login(this.account, this.pwd).then(res => {
              if(res.data === '密码正确') {
                this.sessionId = res.headers.sessionid;
                // vuex中存储加密后的用户账号和密码，使用base64加密
                this.$store.commit('setAccount',window.btoa(this.account));
                this.$store.commit('setPwd',window.btoa(this.pwd));
                this.$router.push('/home')
              }
              else if(res.data === '密码错误'){
                this.$message({
                  type: 'error',
                  message: "密码错误，请重新输入!"
                });
              }
              else {
                this.$message({
                  type: 'error',
                  message: '账号未注册，请先注册'
                });
              }
            })
          }
        }
      },
      register() {
        this.$router.push('/register')
      }
    },
  }
</script>

<style scoped>
  #login {
    background: white;
  }
  .login-dialog {
    position: relative;
    top: 150px;
  }
  #account, #pwd {
    display: block;
    width: 80%;
    height: 30px;
    border: 0;
    margin: 20px 40px;
    border-bottom: 1px solid silver;
  }
  #login-button {
    display: block;
    width: 80%;
    margin: 20px 40px;

  }
  .login-text {
    position: relative;
    left: 35%;
    top: -5px;
    font-size: 12px;
    font-weight: lighter;
  }
</style>