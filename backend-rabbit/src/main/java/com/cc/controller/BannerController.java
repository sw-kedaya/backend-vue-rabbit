package com.cc.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.cc.dto.Result;
import com.cc.entire.Banner;
import com.cc.service.IBannerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("banner")
@RestController
public class BannerController {

    @Resource
    private IBannerService bannerService;

    @GetMapping("list")
    public Result list(@RequestParam(required = false, defaultValue = "1") String distributionSite) {
        LambdaQueryWrapper<Banner> queryWrapper = new LambdaQueryWrapper<>();
        List<Banner> list;
        if ("1".equals(distributionSite)) {
            queryWrapper.orderByDesc(Banner::getId);
            list = bannerService.list(queryWrapper);
        } else {
            list = bannerService.list();
        }
        return Result.ok(list);
    }
}
