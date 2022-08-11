import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    account: Number,
    pwd: ''
  },
  getters: {
  },
  mutations: {
    getAccount(state) {
      return state.account;
    },
    setAccount(state, newAccount){
      state.account = newAccount;
    },
    getPwd(state) {
      return state.pwd;
    },
    setPwd(state, newPwd) {
      state.pwd = newPwd;
    }
  },
  actions: {
  },
  modules: {
  }
})
