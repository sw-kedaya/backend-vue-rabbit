import {ref, onMounted} from "vue";
import {getBannerConditionAPI} from '@/apis/home'

// 轮播图数据
export function useBanner() {
    const bannerList = ref([])
    const getBanner = async () => {
        const res = await getBannerConditionAPI({
            distributionSite: '2'
        })
        bannerList.value = res.data
    }

    onMounted(() => {
        getBanner()
    })

    return {
        bannerList
    }
}