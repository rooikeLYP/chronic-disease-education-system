import {request} from "@/network/request";

export function login(account, pwd) {
  return request({
    method: 'post',
    url: '/users/login',
    data: {
      account,
      pwd
    },
  })
}
export function getUserData(account) {
  return request({
    method: 'post',
    url: '/users/getUserData',
    data: {
      account
    },
  })
}
// export function changePwd(oldPwd, newPwd, sessionID) {
//   return request({
//     method: 'post',
//     url: 'users/changePwd',
//     data: {
//       oldPwd,
//       newPwd,
//       sessionID
//     }
//   })
// }
//
// export function getTools(sessionID) {
//   return request({
//     method: 'post',
//     url: 'tools/getTools',
//     data: {
//       sessionID
//     }
//   })
// }
//
// export function test(telephone, name, num, introduce, isDefault, sessionID) {
//   return request({
//     method: 'post',
//     url: 'telephone/deleteTelephone',
//     data: {
//       telephone,
//       name,
//       num,
//       introduce,
//       isDefault,
//       sessionID
//     }
//   })
// }