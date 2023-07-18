// 引入监听是否抵达图片可视区域的方法
import {useIntersectionObserver} from "@vueuse/core";

export const lazyPlugin = {
    install(app) {
        app.directive('img-lazy', {
            mounted(el, binding) {
                const {stop} = useIntersectionObserver(
                    el,
                    ([{isIntersecting}]) => {
                        if (isIntersecting) {
                            el.src = binding.value
                            stop()
                        }
                    }
                )
            }
        })
    }
}