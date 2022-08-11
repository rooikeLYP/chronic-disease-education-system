import {request} from "@/network/request";

export function getData() {
  return request({
    url: '/getDiseases/getData'
  })
}