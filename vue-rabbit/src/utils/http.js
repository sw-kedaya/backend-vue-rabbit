import axios from 'axios'

const instance = axios.create({
    baseURL: 'http://localhost:8080',
    // baseURL: '/api',
    timeout: 5000
})

// 拦截器
// axios请求拦截器
instance.interceptors.request.use(config => {
    return config
}, e => Promise.reject(e))

// axios响应式拦截器
instance.interceptors.response.use(res => res.data, e => {
    return Promise.reject(e)
})

export default instance