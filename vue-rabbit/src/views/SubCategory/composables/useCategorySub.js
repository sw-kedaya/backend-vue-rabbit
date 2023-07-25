import {getCategorySubFilterAPI} from "@/apis/category";
import {ref, onMounted} from "vue";

export function useCategorySub(data){

    const categoryData = ref([])
    const getCategorySubFilter = async () => {
        const res = await getCategorySubFilterAPI(data)
        categoryData.value = res.data
    }

    onMounted(()=>getCategorySubFilter())

    return{
        categoryData,
        getCategorySubFilter
    }
}
