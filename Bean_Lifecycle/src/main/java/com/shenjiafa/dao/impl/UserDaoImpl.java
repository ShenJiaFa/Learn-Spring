package com.shenjiafa.dao.impl;

import com.shenjiafa.dao.UserDao;

/**
 * Function: 用户数据持久层实现类
 *
 * @author ShenJiaFa
 * @since 2022/9/2
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDao save...");
    }

    public void init() {
        System.out.println("UserDaoImpl init...");
    }

    public void destroy() {
        System.out.println("UserDaoImpl destroy...");
    }
}
