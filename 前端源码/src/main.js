import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import ElementUI from 'element-ui';

import 'element-ui/lib/theme-chalk/index.css';
import 'vant/lib/index.less'
import { Card } from 'vant';
import {Uploader} from "vant";
import { DatetimePicker } from 'vant';
import { ContactList } from 'vant';
import { ContactEdit } from 'vant';
import { Popup } from "vant";
import { Swipe, SwipeItem } from 'vant';
import { RadioGroup, Radio } from 'vant';


Vue.config.productionTip = false
Vue.use(ElementUI)
Vue.use(Card);
Vue.use(Uploader)
Vue.use(DatetimePicker);
Vue.use(ContactList);
Vue.use(ContactEdit);
Vue.use(Popup)
Vue.use(Swipe);
Vue.use(SwipeItem);
Vue.use(Radio);
Vue.use(RadioGroup);

new Vue({
  router,
  store,
  render: function (h) { return h(App) }
}).$mount('#app')
