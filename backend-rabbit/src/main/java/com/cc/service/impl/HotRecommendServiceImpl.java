package com.cc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.entire.HotRecommend;
import com.cc.mapper.HotRecommendMapper;
import com.cc.service.IHotRecommendService;
import org.springframework.stereotype.Service;

@Service
public class HotRecommendServiceImpl extends ServiceImpl<HotRecommendMapper, HotRecommend> implements IHotRecommendService {
}
