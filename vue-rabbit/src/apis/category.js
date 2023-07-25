import instance from '@/utils/http'

export function getCategoryByIDAPI(id){
    return instance({
        method: "get",
        url: '/category',
        params: {
            id
        }
    })
}

export function getCategorySubFilterAPI(id){
    return instance({
        method: "get",
        url: '/category/sub/filter',
        params: {
            id
        }
    })
}