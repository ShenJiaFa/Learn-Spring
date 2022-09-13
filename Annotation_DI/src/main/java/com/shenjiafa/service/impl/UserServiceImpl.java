package com.shenjiafa.service.impl;

import com.shenjiafa.dao.UserDao;
import com.shenjiafa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Function: 用户数据保存实现类
 *
 * @author ShenJiaFa
 * @since 2022/9/2
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("UserService save...");
        userDao.save();
    }

}
