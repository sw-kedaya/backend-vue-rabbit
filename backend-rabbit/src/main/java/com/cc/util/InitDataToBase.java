package com.cc.util;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.cc.dto.CategoryDTO;
import com.cc.entire.Category;
import com.cc.entire.Goods;
import com.cc.entire.HotRecommend;
import com.cc.service.IBannerService;
import com.cc.service.ICategoryService;
import com.cc.service.IGoodsService;
import com.cc.service.IHotRecommendService;
import org.springframework.stereotype.Component;
import com.cc.entire.Banner;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static com.cc.util.InitJson.*;

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

    /**
     * 数据初始化，将项目提供的json数据反向转化成对象存到数据库
     */
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

    public void dataSyncForGoodsNew(){
        JSONObject jsonObject = JSONUtil.parseObj(GOODS_NEW_JSON);
        JSONArray result = jsonObject.getJSONArray("result");
        for (Object o : result) {
            Goods goods = BeanUtil.copyProperties(o, Goods.class);
            goodsService.saveOrUpdate(goods);
        }
    }

    public void dataSyncForHot(){
        JSONObject jsonObject = JSONUtil.parseObj(HOT_JSON);
        JSONArray result = jsonObject.getJSONArray("result");
        for (Object o : result) {
            HotRecommend hotRecommend = BeanUtil.copyProperties(o, HotRecommend.class);
            hotRecommendService.saveOrUpdate(hotRecommend);
        }
    }
}
