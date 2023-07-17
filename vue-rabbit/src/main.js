import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'

// 引入common样式
import '@/styles/common.scss'

// 测试接口-测试完后注释
// import { getCategory } from '@/apis/testAPI'
// getCategory().then(res=>{
//     console.log(res)
// })

const app = createApp(App)

app.use(createPinia())
app.use(router)

app.mount('#app')
