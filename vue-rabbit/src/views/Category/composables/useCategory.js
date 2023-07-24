import {onMounted, ref} from "vue";
import {onBeforeRouteUpdate, useRoute} from "vue-router";
import {getCategoryByIDAPI} from "@/apis/category";

// 分类数据
export function useCategory() {
    const categoryData = ref([])
    const getCategoryById = async (id = useRoute().params.id) => {
        const res = await getCategoryByIDAPI(id)
        categoryData.value = res.data
    }

    onMounted(() => getCategoryById())

// 路由一变化，再调用一次分类接口，to参数里面有id
    onBeforeRouteUpdate((to) => {
        getCategoryById(to.params.id)
    })

    return {
        categoryData
    }
}