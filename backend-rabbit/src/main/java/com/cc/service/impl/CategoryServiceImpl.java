package com.cc.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.dto.CategoryDTO;
import com.cc.dto.Result;
import com.cc.entire.Category;
import com.cc.entire.Goods;
import com.cc.mapper.CategoryMapper;
import com.cc.service.ICategoryService;
import com.cc.service.IGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

    @Resource
    private IGoodsService goodsService;

    @Override
    public Result head() {
        List<CategoryDTO> listDTO = new ArrayList<>();

        // 获取category所有数据
        List<Category> list = list();
        // 获取goods所有数据
        List<Goods> gooodsList = goodsService.list();
        for (Category category : list) {
            CategoryDTO categoryDTO = BeanUtil.copyProperties(category, CategoryDTO.class);
            for (Category c : list) {
                CategoryDTO cDTO = BeanUtil.copyProperties(c, CategoryDTO.class);
                if (Objects.equals(categoryDTO.getId(), cDTO.getParentId())){
                    categoryDTO.getChildren().add(cDTO);
                }
            }
            for (Goods goods : gooodsList) {
                if (Objects.equals(categoryDTO.getId(), goods.getCategoryId())){
                    categoryDTO.getGoods().add(goods);
                }
            }
            if (categoryDTO.getParentId() == null){
                listDTO.add(categoryDTO);
            }
        }

        return Result.ok(listDTO);
    }
}
