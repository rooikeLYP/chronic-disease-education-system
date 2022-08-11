<template>
  <div>
    <van-uploader :after-read="afterRead"/>
  </div>
</template>

<script>
  import {request} from "@/network/request";
  import {dealImage} from "@/function/dealImage/dealImage";

  export default {
    name: "upload",
    methods: {
      afterRead(file) {
        // 此时可以自行将文件上传至服务器
        let newPicture = file.content;
        // 压缩时注意,返回的base64如果没带前缀"data:image/png;base64," 一定要加上,不然压缩不了
        // 500为压缩后的图片宽度
        let _this = this;
        dealImage(newPicture, 500, function (newBase64) {
          request({
            method: 'post',
            url: '/users/changePic',
            data: {
              newPicture: newBase64,
              account: window.atob(_this.$store.state.account)
            }
          }).then(res => {
            if(res.data) {
              _this.$message({
                type: "success",
                message: "上传成功"
              })
              _this.$router.replace('/user')
            }
          }).catch(e => {
            _this.$message({
              type: "error",
              message: "上传失败"
            })
          })
        })
      },
    }
  }
</script>

<style scoped>
  .avatar-uploader .el-upload {
    border: 1px dashed #d9d9d9;
    border-radius: 6px;
    cursor: pointer;
    position: relative;
    overflow: hidden;
  }
  .avatar-uploader .el-upload:hover {
    border-color: #409EFF;
  }
  .avatar-uploader-icon {
    font-size: 28px;
    color: #8c939d;
    width: 178px;
    height: 178px;
    line-height: 178px;
    text-align: center;
  }
  .avatar {
    width: 178px;
    height: 178px;
    display: block;
  }
</style>