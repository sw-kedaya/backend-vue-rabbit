package com.cc.util;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.cc.dto.CategoryDTO;
import com.cc.dto.SalePropertyDTO;
import com.cc.entire.*;
import com.cc.service.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import java.util.List;
import java.util.stream.Collectors;

import static com.cc.util.InitJson.*;

/**
 * 数据初始化，将项目提供的json数据反向转化成对象存到数据库
 */
@Component
public class InitDataToBase {

    @Resource
    private ICategoryService categoryService;
    @Resource
    private IGoodsService goodsService;
    @Resource
    private IBannerService bannerService;
    @Resource
    private IHotRecommendService hotRecommendService;
    @Resource
    private IBrandService brandService;
    @Resource
    private ISalePropertyService salePropertyService;

    public void dataSyncForCategory() {
        JSONObject jsonObject = JSONUtil.parseObj(CATEGORY_JSON);
        JSONArray result = jsonObject.getJSONArray("result");
        for (Object o : result) {
            CategoryDTO categoryDTO = BeanUtil.copyProperties(o, CategoryDTO.class);
            Category category = BeanUtil.copyProperties(categoryDTO, Category.class);
            // 把1级分类存到数据库
            categoryService.saveOrUpdate(category);
            // 把2级分类存到数据库
            next(categoryDTO);
            // 把商品数据存到数据库
            goods(categoryDTO);
        }
    }

    private void next(CategoryDTO parent) {
        if (parent.getChildren() == null) {
            return;
        }
        for (CategoryDTO children : parent.getChildren()) {
            children.setParentId(parent.getId());
            children.setParentName(parent.getName());
            Category category = BeanUtil.copyProperties(children, Category.class);
            categoryService.saveOrUpdate(category);
            // 递归查询还有没有数据
            next(children);
            goods(children);
        }
    }

    private void goods(CategoryDTO parent) {
        if (parent.getGoods() == null) {
            return;
        }
        for (Goods good : parent.getGoods()) {
            good.setCategoryId(parent.getId());
            good.setCategoryPid(parent.getId());
            goodsService.saveOrUpdate(good);
        }
    }

    public void dataSyncForBanner() {
        JSONObject jsonObject = JSONUtil.parseObj(BANNER_JSON);
        JSONArray result = jsonObject.getJSONArray("result");
        for (Object o : result) {
            Banner banner = BeanUtil.copyProperties(o, Banner.class);
            bannerService.saveOrUpdate(banner);
        }
    }

    public void dataSyncForGoodsNew() {
        JSONObject jsonObject = JSONUtil.parseObj(GOODS_NEW_JSON);
        JSONArray result = jsonObject.getJSONArray("result");
        for (Object o : result) {
            Goods goods = BeanUtil.copyProperties(o, Goods.class);
            // 不分类就默认都是杂物
            goods.setCategoryPid(19999999L);
            goodsService.saveOrUpdate(goods);
        }
    }

    public void dataSyncForHot() {
        JSONObject jsonObject = JSONUtil.parseObj(HOT_JSON);
        JSONArray result = jsonObject.getJSONArray("result");
        for (Object o : result) {
            HotRecommend hotRecommend = BeanUtil.copyProperties(o, HotRecommend.class);
            hotRecommendService.saveOrUpdate(hotRecommend);
        }
    }

    public void dataSyncForCategoryById(String json) {
        // 解析json，拿出一级分类的值
        JSONObject jsonObject = JSONUtil.parseObj(json);
        JSONObject result = jsonObject.getJSONObject("result");
        Long id = Long.parseLong(result.get("id").toString());
        String name = result.get("name").toString();

        // 获取二级分类数据
        JSONArray children = result.getJSONArray("children");
        for (Object child : children) {
            // 讲json封装为对象，该对象包含商品数据
            CategoryDTO categoryDTO = BeanUtil.copyProperties(child, CategoryDTO.class);
            categoryDTO.setParentId(id);
            categoryDTO.setParentName(name);

            // 转化DTO成category类，去掉商品数据再存入数据库
            Category category = BeanUtil.copyProperties(categoryDTO, Category.class);
            categoryService.saveOrUpdate(category);

            // 从DTO获取商品数据，设置id后存入数据库
            List<Goods> goods = categoryDTO.getGoods().stream().peek(item -> {
                        item.setCategoryId(category.getId());
                        if (category.getParentId() != null) {
                            item.setCategoryPid(category.getParentId());
                        } else {
                            item.setCategoryPid(category.getId());
                        }
                    }).collect(Collectors.toList());
            goodsService.saveOrUpdateBatch(goods);
        }
    }

    public void dataSyncForBrandAndSaleProperty(Long id){
        // 获取json数据
        InitJsonByURL initJsonByURL = new InitJsonByURL();
        String json = initJsonByURL.getBrandAndSalePropertyJson(id);
        if (json == null){
            return;
        }
        JSONObject result = JSONUtil.parseObj(json).getJSONObject("result");
        CategoryDTO categoryDTO = JSONUtil.toBean(result, CategoryDTO.class);

        // 新增category的brandId参数
        Category category = BeanUtil.copyProperties(categoryDTO, Category.class);
        if (categoryDTO.getBrands().size() != 0){
            category.setBrandId(categoryDTO.getBrands().get(0).getId());
            categoryService.saveOrUpdate(category);
        }

        // 新增good数据
        for (Goods good : categoryDTO.getGoods()) {
            good.setCategoryId(categoryDTO.getId());
            good.setCategoryPid(categoryDTO.getParentId());
            if (categoryDTO.getBrands().size() != 0){
                good.setBrandId(categoryDTO.getBrands().get(0).getId());
            }
            goodsService.saveOrUpdate(good);
        }

        // 新增category的layer参数
        for (Category c : categoryDTO.getCategories()) {
            categoryService.saveOrUpdate(c);
        }

        // 保存brand数据
        for (Brand brand : categoryDTO.getBrands()) {
            brandService.saveOrUpdate(brand);
        }

        // 保存property数据
        for (SalePropertyDTO salePropertyDTO : categoryDTO.getSaleProperties()) {
            // 保存父数据
            SaleProperty spParent = BeanUtil.copyProperties(salePropertyDTO, SaleProperty.class);
            spParent.setCategoryId(categoryDTO.getId());
            salePropertyService.saveOrUpdate(spParent);
            // 保存子数据
            List<SaleProperty> properties = salePropertyDTO.getProperties();
            for (SaleProperty property : properties) {
                property.setParentId(spParent.getId());
                property.setCategoryId(categoryDTO.getId());
                salePropertyService.saveOrUpdate(property);
            }
        }
    }
}
