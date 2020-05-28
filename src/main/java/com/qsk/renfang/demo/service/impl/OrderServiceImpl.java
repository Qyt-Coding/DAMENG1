package com.qsk.renfang.demo.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qsk.renfang.demo.dao.OrderMapper;
import com.qsk.renfang.demo.demain.Order;
import com.qsk.renfang.demo.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : 披荆斩棘
 * @date : 2017/9/8
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Override
    public List<Order> list () {
        return baseMapper.selectList(null) ;
    }
}
