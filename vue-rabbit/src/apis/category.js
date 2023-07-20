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