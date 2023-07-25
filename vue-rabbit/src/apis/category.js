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

export function getCategorySubFilterAPI(data){
    return instance({
        method: "post",
        url: '/category/sub/filter',
        data
    })
}