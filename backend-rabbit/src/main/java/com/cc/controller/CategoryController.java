package com.cc.controller;

import com.cc.dto.Result;
import com.cc.service.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/category")
@RestController
public class CategoryController {

    @Resource
    private ICategoryService categoryService;

    @GetMapping("head")
    public Result head(){
        return categoryService.head();
    }
}
