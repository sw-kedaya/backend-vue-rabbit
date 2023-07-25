import {getCategorySubFilterAPI} from "@/apis/category";
import {ref, onMounted} from "vue";
import {useRoute} from "vue-router";

export function useCategorySub(){

    const categoryData = ref([])
    const route = useRoute()
    const getCategorySubFilter = async () => {
        const res = await getCategorySubFilterAPI(route.params.id)
        categoryData.value = res.data
    }

    onMounted(()=>getCategorySubFilter())

    return{
        categoryData
    }
}
