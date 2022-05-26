package com.hhp.spring.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhp.spring.entity.Money;
import com.hhp.spring.mapper.MoneyMapper;
import com.hhp.spring.service.IMoneyService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class MoneyServiceImpl extends ServiceImpl<MoneyMapper, Money> implements IMoneyService {

    @DS("story")
    public List<Money> findByStoryIds(Collection<Long> ids) {
        return baseMapper.selectBatchIds(ids);
    }

    @DS("test")
    public List<Money> findByTestIds(Collection<Long> ids) {
        return baseMapper.selectBatchIds(ids);
    }
}
