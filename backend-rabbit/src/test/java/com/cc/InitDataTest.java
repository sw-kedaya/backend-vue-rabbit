package com.cc;

import com.cc.util.InitDataToBase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

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
}
