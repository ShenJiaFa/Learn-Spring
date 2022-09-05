package com.shenjiafa.base_config.service.impl;

import com.shenjiafa.base_config.dao.UserDao;
import com.shenjiafa.base_config.service.UserService;

/**
 * Function: 用户数据保存实现类
 *
 * @author ShenJiaFa
 * @since 2022/9/2
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("UserService save...");
        userDao.save();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
