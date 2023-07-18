package com.cc.controller;

import com.cc.dto.Result;
import com.cc.service.IHotRecommendService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("hot")
@RestController
public class HotRecommendController {
    @Resource
    private IHotRecommendService hotRecommendService;

    @GetMapping("list")
    public Result list(){
        return Result.ok(hotRecommendService.list());
    }
}
