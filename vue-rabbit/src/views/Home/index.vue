<script setup>
import HomeCategory from './components/HomeCategory.vue'
import HomeBanner from './components/HomeBanner.vue'
import HomeNew from './components/HomeNew.vue'
import HomeHot from './components/HomeHot.vue'
import HomeProduct from './components/HomeProduct.vue'
import HomePanel from "@/views/Home/components/HomePanel.vue";
</script>

<template>
  <div class="container">
    <HomeCategory />
    <HomeBanner />
  </div>
  <HomeNew />
  <HomeHot />
  <HomeProduct />
<!--  测试面板 -->
  <HomePanel title="1" sub-title="1">
    <div>
      123
    </div>
  </HomePanel>
  <HomePanel title="2" sub-title="2">
    <div>
      123
    </div>
  </HomePanel>
</template>