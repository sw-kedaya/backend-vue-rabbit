package com.cc;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.cc.dto.CategoryDTO;
import com.cc.entire.Category;
import com.cc.entire.Goods;
import com.cc.service.ICategoryService;
import com.cc.service.IGoodsService;
import com.cc.util.InitDataToBase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static com.cc.util.InitJson.CATEGORY_JSON;

@SpringBootTest
class BackendRabbitApplicationTests {

    @Resource
    private ICategoryService categoryService;
    @Resource
    private IGoodsService goodsService;

    @Test
    void jsonToList() {
        // 将json解析成对象
        JSONObject jsonObject = JSONUtil.parseObj(CATEGORY_JSON);
        JSONArray result = jsonObject.getJSONArray("result");
        List<CategoryDTO> list = new ArrayList<>();
        for (Object o : result) {
            CategoryDTO categoryDTO = BeanUtil.copyProperties(o, CategoryDTO.class);
            list.add(categoryDTO);
        }
        System.out.println(list.get(0).getGoods());
    }

    @Test
    void dataSync() {
        JSONObject jsonObject = JSONUtil.parseObj(CATEGORY_JSON);
        JSONArray result = jsonObject.getJSONArray("result");
        for (Object o : result) {
            CategoryDTO categoryDTO = BeanUtil.copyProperties(o, CategoryDTO.class);
            Category category = BeanUtil.copyProperties(categoryDTO, Category.class);
            System.out.println(category);
            // 把1级分类存到数据库
            categoryService.save(category);
            // 把2级分类存到数据库
            next(categoryDTO);
            // 把商品数据存到数据库
            goods(categoryDTO);
        }
    }

    void next(CategoryDTO parent) {
        if (parent.getChildren() == null) {
            return;
        }
        for (CategoryDTO children : parent.getChildren()) {
            children.setParentId(parent.getId());
            children.setParentName(parent.getName());
            Category category = BeanUtil.copyProperties(children, Category.class);
            categoryService.save(category);
            // 递归查询还有没有数据
            next(children);
            goods(children);
        }
    }

    void goods(CategoryDTO parent) {
        if (parent.getGoods() == null) {
            return;
        }
        for (Goods good : parent.getGoods()) {
            goodsService.save(good);
        }
    }
}
