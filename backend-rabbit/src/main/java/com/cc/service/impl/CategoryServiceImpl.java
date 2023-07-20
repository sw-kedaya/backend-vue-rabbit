package com.cc.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.dto.CategoryDTO;
import com.cc.dto.Result;
import com.cc.entire.Category;
import com.cc.entire.Goods;
import com.cc.mapper.CategoryMapper;
import com.cc.service.ICategoryService;
import com.cc.service.IGoodsService;
import org.springframework.context.annotation.Bean;
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
                if (Objects.equals(categoryDTO.getId(), cDTO.getParentId())) {
                    categoryDTO.getChildren().add(cDTO);
                }
            }
            for (Goods goods : gooodsList) {
                if (Objects.equals(categoryDTO.getId(), goods.getCategoryId())) {
                    categoryDTO.getGoods().add(goods);
                }
            }
            if (categoryDTO.getParentId() == null) {
                listDTO.add(categoryDTO);
            }
        }

        return Result.ok(listDTO);
    }

    @Override
    public Result withGoods() {
        // 响应集合
        List<CategoryDTO> result = new ArrayList<>();
        // 获取category所有数据
        List<Category> list = list();
        // 获取goods所有数据
        List<Goods> gooodsList = goodsService.list();
        for (Category category : list) {
            CategoryDTO categoryDTO = BeanUtil.copyProperties(category, CategoryDTO.class);
            int count = 0;
            for (Goods goods : gooodsList) {
                // 只要商品的分类id或者分类父id匹配，就封装进去
                if (Objects.equals(categoryDTO.getId(), goods.getCategoryPid()) ||
                        Objects.equals(categoryDTO.getParentId(), goods.getCategoryPid())) {
                    // 只要8个商品
                    if (count < 8) {
                        count++;
                        categoryDTO.getGoods().add(goods);
                    }
                }
            }
            // 父分类是没有父id的，以此作为条件
            if (categoryDTO.getParentId() == null) {
                result.add(categoryDTO);
            }
        }

        return Result.ok(result);
    }

    @Override
    public Result findById(Long id) {
        // 获取当前id的数据并转换成DTO
        CategoryDTO result = BeanUtil.copyProperties(getById(id), CategoryDTO.class);
        // 获取category所有数据
        List<Category> list = list();
        // 获取goods所有数据
        List<Goods> gooodsList = goodsService.list();
        // 封装子数据和goods数据
        for (Category category : list) {
            // 如果子父id一致，则封装
            if (Objects.equals(category.getParentId(), id)) {
                CategoryDTO categoryDTO = BeanUtil.copyProperties(category, CategoryDTO.class);
                for (Goods goods : gooodsList) {
                    // 如果商品的分类id与该分类id一致，则封装
                    if (Objects.equals(goods.getCategoryId(), categoryDTO.getId())) {
                        categoryDTO.getGoods().add(goods);
                    }
                }
                result.getChildren().add(categoryDTO);
            }
        }

        return Result.ok(result);
    }
}
