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
    void init01() {
        initDataToBase.dataSync();
    }
}
