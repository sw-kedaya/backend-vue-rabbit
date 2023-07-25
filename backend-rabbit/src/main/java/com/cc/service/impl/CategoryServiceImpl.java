package com.cc.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.dto.CategoryDTO;
import com.cc.dto.Result;
import com.cc.dto.SalePropertyDTO;
import com.cc.entire.Brand;
import com.cc.entire.Category;
import com.cc.entire.Goods;
import com.cc.entire.SaleProperty;
import com.cc.mapper.CategoryMapper;
import com.cc.service.*;
import com.cc.vo.RequestForSubCategory;
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
    @Resource
    private IBrandService brandService;
    @Resource
    private ISalePropertyService salePropertyService;

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

    @Override
    public Result getSubFilterById(RequestForSubCategory request) {
        // 1.根据id取出分类数据，并封装到DTO
        CategoryDTO categoryDTO = BeanUtil.copyProperties(getById(request.getId()), CategoryDTO.class);

        // 2.根据分类id获取并封装商品数据-goods
        // 2.1 分类筛选和分页查询
        Page<Goods> pageInfo = new Page<>(request.getPage(),request.getPageSize());
        LambdaQueryWrapper<Goods> queryWrapper = new LambdaQueryWrapper<Goods>()
                .eq(Goods::getCategoryId, categoryDTO.getId());
        // "最新商品" sortField="publishTime"
        // "最高人气" sortField="orderNum"
        // "评论最多" sortField="evaluateNum"
        // 以下由于字段缺少原因，排序是乱来的
        if ("publishTime".equals(request.getSortField())){
            queryWrapper.orderByDesc(Goods::getId);
        }else if ("orderNum".equals(request.getSortField())){
            queryWrapper.orderByDesc(Goods::getOrderNum);
        }
        List<Goods> goodsList = goodsService.page(pageInfo, queryWrapper).getRecords();
        categoryDTO.getGoods().addAll(goodsList);

        // 3.根据该分类数据的父id，查询出其他子分类并封装-categories
        List<Category> categories = list(new LambdaQueryWrapper<Category>()
                .select(Category::getId, Category::getName, Category::getLayer)
                .eq(Category::getParentId, categoryDTO.getParentId()));
        categoryDTO.getCategories().addAll(categories);

        // 4.根据该分类数据的brandId获取品牌数据-brands
        List<Brand> brandList = brandService.list(new LambdaQueryWrapper<Brand>()
                .eq(Brand::getId, categoryDTO.getBrandId()));
        categoryDTO.getBrands().addAll(brandList);

        // 5.根据分类id获取saleProperties数据并封装
        // 5.1首先获取父级property
        List<SaleProperty> parentSaleProperties = salePropertyService.list(new LambdaQueryWrapper<SaleProperty>()
                .isNull(SaleProperty::getParentId)
                .eq(SaleProperty::getCategoryId, categoryDTO.getId()));
        // 5.2然后根据父id取出其他子数据并封装
        for (SaleProperty parentSaleProperty : parentSaleProperties) {
            SalePropertyDTO salePropertyDTO = BeanUtil.copyProperties(parentSaleProperty, SalePropertyDTO.class);
            List<SaleProperty> saleProperties = salePropertyService.list(new LambdaQueryWrapper<SaleProperty>()
                    .eq(SaleProperty::getParentId, salePropertyDTO.getId()));
            salePropertyDTO.getProperties().addAll(saleProperties);
            categoryDTO.getSaleProperties().add(salePropertyDTO);
        }

        return Result.ok(categoryDTO);
    }
}
