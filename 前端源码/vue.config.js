const { defineConfig } = require('@vue/cli-service')

const path = require('path')

module.exports = defineConfig({
  transpileDependencies: true,
  configureWebpack: {
    resolve: {
      alias: {
        'assets': '@/assets',
        'components': '@/components',
        'network': '@/network',
        'views': '@/views',
      }
    }
  },
  publicPath: './',
  css: {
    loaderOptions: {
      less: {
        lessOptions: {
          javascriptEnabled:true,
          modifyVars: {
            // 从盘符开始的路径，叫做绝对路径   C:\\Users\liulongbin\\theme.less
            hack: `true; @import "${
                path.join(__dirname,
                    "./src/assets/css/radio.less")
            }";`
          }
        }

      }
    }
  },
  assetsDir: 'static',
  outputDir: 'dist',
  devServer: {
    port: 8090,
  },
})
