import {createRouter, createWebHistory} from 'vue-router'
import Login from '@/views/Login/index.vue'
import Layout from '@/views/Layout/index.vue'
import Home from '@/views/Home/index.vue'
import Category from '@/views/Category/index.vue'
import SubCategory from '@/views/SubCategory/index.vue'

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: '/',
            component: Layout,
            children: [
                {
                    path: '',
                    component: Home
                },
                {
                    path: 'category/:id',
                    component: Category
                },
                {
                    path: 'category/sub/:id',
                    component: SubCategory
                }
            ]
        },
        {
            path: '/login',
            component: Login
        },
    ],
    // 路由切换时自动到顶部
    scrollBehavior() {
        return {
            top: 0
        }
    }
})

export default router
