package com.shenjiafa.di_quickstart.service.impl;

import com.shenjiafa.di_quickstart.dao.UserDao;
import com.shenjiafa.di_quickstart.service.UserService;

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
