package com.shenjiafa.service.impl;

import com.shenjiafa.dao.UserDao;
import com.shenjiafa.service.UserService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Function: 用户数据保存实现类
 *
 * @author ShenJiaFa
 * @since 2022/9/2
 */
public class UserServiceImpl implements UserService, InitializingBean, DisposableBean {
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("UserService save...");
        userDao.save();
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("set...");
        this.userDao = userDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("UserServiceImpl destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserServiceImpl init...");
    }
}
