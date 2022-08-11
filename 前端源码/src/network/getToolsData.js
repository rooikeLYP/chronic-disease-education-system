import {request} from "@/network/request";

export function getTools(account) {
  return request({
    url: '/tools/getTools',
    data: {
      account
    }
  })
}