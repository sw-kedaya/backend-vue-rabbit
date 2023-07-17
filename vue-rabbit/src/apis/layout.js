import instance from '@/utils/http'

export function getCategoryAPI(){
    return instance({
        method: "get",
        url: "/category/head"
    })
}