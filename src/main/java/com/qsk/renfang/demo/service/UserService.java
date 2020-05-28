package com.qsk.renfang.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qsk.renfang.demo.demain.Order;
import com.qsk.renfang.demo.demain.User;

import java.util.List;

/**
 * @author : qin shengkai
 * @date : 2017/9/8
 */
public interface UserService extends IService<User> {
    
    List<User> list();
}
