import Vue from 'vue'
import VueRouter from 'vue-router'
Vue.use(VueRouter)

import home from "@/views/home/home";
import tools from "@/views/tools/tools";
import user from "@/views/user/user";
import login from "@/views/login/login"
import userDetail from "@/views/user/user-detail/user-detail"
import alarmClock from '@/components/content/alarm-clock/alarm-clock'
import mainTelephone from "@/components/content/telephone/mainTelephone";
import mainSweet from "@/components/content/diseases/sweet/mainSweet";
import mainHigh from "@/components/content/diseases/high/mainHigh";
import sweetKnowledge from "@/components/content/diseases/sweet/sweetKnowledge";
import sweetDiet from "@/components/content/diseases/sweet/sweetDiet";
import sweetSport from "@/components/content/diseases/sweet/sweetSport";
import sweetMonitor from "@/components/content/diseases/sweet/sweetMonitor";
import sweetMedicine from "@/components/content/diseases/sweet/sweetMedicine";
import sweetSugar from "@/components/content/diseases/sweet/sweetSugar";
import sweetFoot from "@/components/content/diseases/sweet/sweetFoot";
import highKnowledge from "@/components/content/diseases/high/highKnowledge";
import highPrevent from "@/components/content/diseases/high/highPrevent";
import highMonitor from "@/components/content/diseases/high/highMonitor";
import highVideo from "@/components/content/diseases/high/highVideo";
import highSport from "@/components/content/diseases/high/highSport";
import highMedicine from "@/components/content/diseases/high/highMedicine";
import highDiet from "@/components/content/diseases/high/highDiet";
import selfIntroduce from "@/components/content/selfIntroduce/selfIntroduce";
import mainLung from "@/components/content/diseases/lung/mainLung";
import lungKnowledge from "@/components/content/diseases/lung/lungKnowledge";
import lungPrevent from "@/components/content/diseases/lung/lungPrevent";
import lungMedicine from "@/components/content/diseases/lung/lungMedicine";
import lungMethods from "@/components/content/diseases/lung/lungMethods";
import lungTrain from "@/components/content/diseases/lung/lungTrain";
import lungSport from "@/components/content/diseases/lung/lungSport";
import mainHeart from "@/components/content/diseases/heart/mainHeart";
import heartDiet from "@/components/content/diseases/heart/heartDiet";
import heartHandle from "@/components/content/diseases/heart/heartHandle";
import heartKnowledge from "@/components/content/diseases/heart/heartKnowledge";
import heartMedicine from "@/components/content/diseases/heart/heartMedicine";
import heartPrevent from "@/components/content/diseases/heart/heartPrevent";
import heartSport from "@/components/content/diseases/heart/heartSport";
import register from "@/views/login/register";
import questionnaire from "@/views/questionnaire/questionnaire";
import questionsList from "@/components/content/questionnaire/questionsList";

const routes = [
  {
    path: '/',
    redirect: 'login',
  }, {
    path: '/login',
    name: 'login',
    component: login
  }, {
    path: '/home',
    name: 'home',
    component: home
  }, {
    path: '/tools',
    name: 'tools',
    component: tools
  }, {
    path: '/user',
    name: 'user',
    component: user
  }, {
    path: '/questionnaire',
    name: 'questionnaire',
    component: questionnaire,
  }, {
    path: '/questionsList',
    name: 'questionsList',
    component: questionsList,
  },{
    path: '/user-detail',
    name: 'user-detail',
    component: userDetail,
  }, {
    path: '/alarm-clock',
    name: 'alarm-clock',
    keepAlive: true,
    component: alarmClock
  }, {
    path: '/telephone',
    name: 'telephone',
    component: mainTelephone
  }, {
    path: '/selfIntroduce',
    name: 'selfIntroduce',
    component: selfIntroduce
  }, {
    path: '/sweet',
    name: 'sweet',
    component: mainSweet
  }, {
    path: '/high',
    name: 'high',
    component: mainHigh
  }, {
    path: '/sweetKnowledge',
    name: 'sweetKnowledge',
    component: sweetKnowledge
  }, {
    path: '/sweetDiet',
    name: 'sweetDiet',
    component: sweetDiet
  }, {
    path: '/sweetSport',
    name: 'sweetSport',
    component: sweetSport
  }, {
    path: '/sweetMonitor',
    name: 'sweetMonitor',
    component: sweetMonitor
  }, {
    path: '/sweetMedicine',
    name: 'sweetMedicine',
    component: sweetMedicine
  }, {
    path: '/sweetSugar',
    name: 'sweetSugar',
    component: sweetSugar
  }, {
    path: '/sweetFoot',
    name: 'sweetFoot',
    component: sweetFoot
  }, {
    path: '/highKnowledge',
    name: 'highKnowledge',
    component: highKnowledge
  }, {
    path: '/highPrevent',
    name: 'highPrevent',
    component: highPrevent
  }, {
    path: '/highMonitor',
    name: 'highMonitor',
    component: highMonitor
  }, {
    path: '/highVideo',
    name: 'highVideo',
    component: highVideo
  }, {
    path: '/highSport',
    name: 'highSport',
    component: highSport
  }, {
    path: '/highMedicine',
    name: 'highMedicine',
    component: highMedicine
  }, {
    path: '/highDiet',
    name: 'highDiet',
    component: highDiet
  }, {
    path: '/lung',
    name: 'lung',
    component: mainLung
  }, {
    path: '/lungKnowledge',
    name: 'lungKnowledge',
    component: lungKnowledge
  }, {
    path: '/lungPrevent',
    name: 'lungPrevent',
    component: lungPrevent
  }, {
    path: '/lungMedicine',
    name: 'lungMedicine',
    component: lungMedicine
  }, {
    path: '/lungMethods',
    name: 'lungMethods',
    component: lungMethods
  }, {
    path: '/lungTrain',
    name: 'lungTrain',
    component: lungTrain
  }, {
    path: '/lungSport',
    name: 'lungSport',
    component: lungSport
  }, {
    path: '/heart',
    name: 'heart',
    component: mainHeart
  }, {
    path: '/heartDiet',
    name: 'heartDiet',
    component: heartDiet
  }, {
    path: '/heartHandle',
    name: 'heartHandle',
    component: heartHandle
  }, {
    path: '/heartKnowledge',
    name: 'heartKnowledge',
    component: heartKnowledge
  }, {
    path: '/heartMedicine',
    name: 'heartMedicine',
    component: heartMedicine
  }, {
    path: '/heartPrevent',
    name: 'heartPrevent',
    component: heartPrevent
  }, {
    path: '/heartSport',
    name: 'heartSport',
    component: heartSport
  }, {
    path: '/register',
    name: 'register',
    component: register
  }

]

const router = new VueRouter({
  mode: 'history',
  // base: process.env.BASE_URL,
  base: '/myvue/',
  routes
})

export default router
