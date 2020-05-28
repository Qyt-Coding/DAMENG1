package com.qsk.renfang.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qsk.renfang.demo.demain.Order;

import java.util.List;

/**
 * @author : 披荆斩棘
 * @date : 2017/9/8
 */
public interface OrderService extends IService< Order > {
    
    List<Order> list();
}
