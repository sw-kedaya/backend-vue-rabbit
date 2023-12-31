import instance from '@/utils/http'

export function getBannerAPI() {
    return instance({
        method: "get",
        url: '/banner/list'
    })
}

export function findNewAPI() {
    return instance({
        method: "get",
        url: '/goods/new'
    })
}

export function findHotAPI() {
    return instance({
        method: "get",
        url: '/hot/list'
    })
}

export const getGoodsAPI = () => {
    return instance({
        method: "get",
        url: '/category/withGoods'
    })
}

export function getBannerConditionAPI(params = {}) {
    const {distributionSite = '1'} = params
    return instance({
        method: "get",
        url: '/banner/list',
        params: {
            distributionSite
        }
    })
}