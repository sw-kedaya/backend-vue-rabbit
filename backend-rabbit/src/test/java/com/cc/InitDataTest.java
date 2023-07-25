package com.cc;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.cc.entire.Category;
import com.cc.service.ICategoryService;
import com.cc.util.InitDataToBase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static com.cc.util.InitJson.*;

@SpringBootTest
public class InitDataTest {

    @Resource
    private InitDataToBase initDataToBase;
    @Resource
    private ICategoryService categoryService;

    @Test
    void initCategory() {
        initDataToBase.dataSyncForCategory();
    }

    @Test
    void initBanner() {
        initDataToBase.dataSyncForBanner();
    }

    @Test
    void initGoodsNew() {
        initDataToBase.dataSyncForGoodsNew();
    }

    @Test
    void initHot() {
        initDataToBase.dataSyncForHot();
    }

    @Test
    void initCategoryById() {
        initDataToBase.dataSyncForCategoryById(CATEGORY_1005000_JSON);
        initDataToBase.dataSyncForCategoryById(CATEGORY_1013001_JSON);
        initDataToBase.dataSyncForCategoryById(CATEGORY_1011000_JSON);
        initDataToBase.dataSyncForCategoryById(CATEGORY_1043000_JSON);
        initDataToBase.dataSyncForCategoryById(CATEGORY_1010000_JSON);
        initDataToBase.dataSyncForCategoryById(CATEGORY_1019000_JSON);
        initDataToBase.dataSyncForCategoryById(CATEGORY_109243029_JSON);
        initDataToBase.dataSyncForCategoryById(CATEGORY_1005002_JSON);
        initDataToBase.dataSyncForCategoryById(CATEGORY_19999999_JSON);
    }

    @Test
    void initBrandAndProperty(){
        // 取出所有二级分类数据
        List<Category> list = categoryService.list(new LambdaQueryWrapper<Category>().isNotNull(Category::getParentId));
        for (Category category : list) {
            initDataToBase.dataSyncForBrandAndSaleProperty(category.getId());
        }
    }
}
