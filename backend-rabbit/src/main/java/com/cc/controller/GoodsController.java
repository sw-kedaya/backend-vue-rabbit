package com.cc.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.cc.dto.Result;
import com.cc.entire.Goods;
import com.cc.service.IGoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/goods")
@RestController
public class GoodsController {
    @Resource
    private IGoodsService goodsService;

    @GetMapping("new")
    public Result findNew(){
        LambdaQueryWrapper<Goods> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.gt(Goods::getOrderNum,0)
                .orderByDesc(Goods::getOrderNum)
                .last("limit 4");
        return Result.ok(goodsService.list(queryWrapper));
    }
}
