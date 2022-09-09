package com.shenjiafa.dao.impl;

import com.shenjiafa.dao.UserDao;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/8
 */
public class UserDaoImpl implements UserDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("name is " + name);
    }
}
