package com.qsk.renfang.demo.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qsk.renfang.demo.dao.OrderMapper;
import com.qsk.renfang.demo.dao.UserMapper;
import com.qsk.renfang.demo.demain.Order;
import com.qsk.renfang.demo.demain.User;
import com.qsk.renfang.demo.service.OrderService;
import com.qsk.renfang.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : 披荆斩棘
 * @date : 2017/9/8
 */
@Service
@DS("slave_1")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public List<User> list () {
        return baseMapper.selectList(null) ;
    }
}
