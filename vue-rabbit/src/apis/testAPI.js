import instance from '@/utils/http'

export function getCategory(){
    return instance({
        method: 'get',
        url: 'test/frontend'
    })
}