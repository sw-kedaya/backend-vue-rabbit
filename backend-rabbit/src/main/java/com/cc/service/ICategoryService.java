package com.cc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cc.dto.Result;
import com.cc.entire.Category;

public interface ICategoryService extends IService<Category> {
    Result head();

    Result withGoods();

    Result findById(Long id);

    Result getSubFilterById(Long id);
}
