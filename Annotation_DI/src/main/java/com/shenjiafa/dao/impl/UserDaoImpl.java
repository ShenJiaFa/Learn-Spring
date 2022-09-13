package com.shenjiafa.dao.impl;

import com.shenjiafa.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * Function: 用户数据持久层实现类
 *
 * @author ShenJiaFa
 * @since 2022/9/2
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("UserDao save..." + name);
    }
}