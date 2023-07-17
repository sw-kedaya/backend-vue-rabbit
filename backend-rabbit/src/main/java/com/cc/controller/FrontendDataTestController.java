package com.cc.controller;

import com.cc.dto.Result;
import com.cc.service.IFrontendDataTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/test")
@RestController
public class FrontendDataTestController {
    @Resource
    private IFrontendDataTestService frontendDataTestService;

    @GetMapping("frontend")
    public Result frontend(){
        return Result.ok(frontendDataTestService.getById(1));
    }
}
