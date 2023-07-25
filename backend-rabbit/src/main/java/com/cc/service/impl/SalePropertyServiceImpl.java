package com.cc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.entire.SaleProperty;
import com.cc.mapper.SalePropertyMapper;
import com.cc.service.ISalePropertyService;
import org.springframework.stereotype.Service;

@Service
public class SalePropertyServiceImpl extends ServiceImpl<SalePropertyMapper, SaleProperty> implements ISalePropertyService {
}
