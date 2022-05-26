package com.hhp.spring.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhp.spring.entity.Money;
import com.hhp.spring.mapper.MoneyMapper;
import com.hhp.spring.service.IMoneyService;
import org.springframework.stereotype.Service;

@Service
@DS("test")
public class TestMoneyServiceImpl extends ServiceImpl<MoneyMapper, Money> implements IMoneyService {
}
