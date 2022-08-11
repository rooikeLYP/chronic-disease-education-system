import axios from "axios";

// 第四种封装：直接返回axios的实例，因为该实例本身就是一个Promise对象
export function request(config, success, failure) {
  const request = axios.create({
    baseURL: 'http://8.130.103.12:8000',
    // baseURL: 'http://localhost:8000',
    timeout: 5000
  })
  // 请求拦截：在请求发送前进行拦截
  // request.interceptors.request.use(config => {
  //   console.log(config);
  //   return config
  // }, err => {
  // })
  // 响应拦截：
  // request.interceptors.response.use(res => {
  //   // console.log(res.data);
  //   return res;
  // }, err => {
  //
  // })
  return request(config)
}