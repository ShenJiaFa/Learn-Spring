package com.shenjiafa.dao.impl;

import com.shenjiafa.dao.UserDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Function: 用户数据持久层实现类
 *
 * @author ShenJiaFa
 * @since 2022/9/2
 */
@Repository("userDao")
@Scope("singleton")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDao save...");
    }

    @PostConstruct
    public void init() {
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy...");
    }
}