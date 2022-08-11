<template>
  <div id="register">
    <div class="register-dialog">
      <p>
        <input placeholder="请输入手机号"
               id="account"
               type="number"
               v-model="account"
               required
               @click="show = true"
        ></input>
        <input v-model="pwd"
               id="pwd"
               placeholder="请输入密码"
               type="password"
               required
               @click="show = true"
        ></input>
        <input v-model="name"
               id="name"
               placeholder="请输入昵称"
               required
               @click="show = true"
        ></input>
      </p>
    </div>
    <el-button type="primary" id="login-button" @click="onSubmit">注册</el-button>
    <span class="login-text" @click="login">已有账号？| 去登陆</span>
  </div>
</template>

<script>
  import {request} from "@/network/request";

  export default {
    name: "register",
    data() {
      return {
        account: '',
        pwd: '',
        name: ''
      }
    },
    methods: {
      onSubmit() {
        let reg = /^1(3[0-9]|5[0-3,5-9]|7[1-3,5-8]|8[0-9])\d{8}$/;
        if(this.account !== '' && this.pwd !== '' && this.name !== '') {
          if(this.account.length === 11 && reg.test(this.account)) {
            request({
              url: '/users/addUser',
              method: 'post',
              data: {
                account: this.account,
                pwd: this.pwd,
                name: this.name
              }
            }).then(res => {
              if(res.data === "注册成功") {
                this.$message({
                  type: 'success',
                  message: '注册成功'
                })
                this.$router.push('/login')
              }
              else {
                this.$message({
                  type: 'error',
                  message: '账号已注册'
                })
              }
            })
          }
          else {
            this.$message({
              type: 'error',
              message: '请输入正确的手机号'
            })
          }
        }
        else {
          this.$message({
            type: 'error',
            message: '请输入完整信息'
          })
        }
      },
      login() {
        this.$router.push('/login');
      }
    }
  }
</script>

<style scoped>
  #register {
    background: white;
  }
  .register-dialog {
    position: relative;
    top: 150px;
  }
  #account, #pwd, #name {
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
    position: relative;
    top: 150px;
  }
  .login-text {
    position: relative;
    left: 35%;
    top: 140px;
    font-size: 12px;
    font-weight: lighter;
  }
</style>