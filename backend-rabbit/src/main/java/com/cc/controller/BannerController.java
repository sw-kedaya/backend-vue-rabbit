package com.cc.controller;

import com.cc.dto.Result;
import com.cc.service.IBannerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("banner")
@RestController
public class BannerController {

    @Resource
    private IBannerService bannerService;

    @GetMapping("list")
    public Result list(){
        return Result.ok(bannerService.list());
    }
}
