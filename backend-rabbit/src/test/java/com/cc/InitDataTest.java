package com.cc;

import com.cc.util.InitDataToBase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static com.cc.util.InitJson.*;

@SpringBootTest
public class InitDataTest {

    @Resource
    private InitDataToBase initDataToBase;

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
}
