package com.cc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.entire.Banner;
import com.cc.mapper.BannerMapper;
import com.cc.service.IBannerService;
import org.springframework.stereotype.Service;

@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper,Banner> implements IBannerService {
}
