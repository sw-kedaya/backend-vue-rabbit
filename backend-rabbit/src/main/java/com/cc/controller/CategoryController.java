package com.cc.controller;

import com.cc.dto.Result;
import com.cc.service.ICategoryService;
import com.cc.vo.RequestForSubCategory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequestMapping("/category")
@RestController
public class CategoryController {

    @Resource
    private ICategoryService categoryService;

    @GetMapping("head")
    public Result head() {
        return categoryService.head();
    }

    @GetMapping("withGoods")
    public Result withGoods() {
        return categoryService.withGoods();
    }

    @GetMapping
    public Result findById(@RequestParam Long id){
        return categoryService.findById(id);
    }
        //sub/filter?id=1005999003
    @PostMapping("sub/filter")
    public Result getSubFilterById(@RequestBody RequestForSubCategory request){
        return categoryService.getSubFilterById(request);
    }
}
