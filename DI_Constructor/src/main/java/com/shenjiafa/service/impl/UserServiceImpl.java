package com.shenjiafa.service.impl;

import com.shenjiafa.dao.BookDao;
import com.shenjiafa.dao.UserDao;
import com.shenjiafa.service.UserService;

/**
 * Function: 用户数据保存实现类
 *
 * @author ShenJiaFa
 * @since 2022/9/2
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private BookDao bookDao;


    @Override
    public void save() {
        System.out.println("UserService save...");
        userDao.save();
        bookDao.save();
    }

    public UserServiceImpl(UserDao userDao, BookDao bookDao) {
        this.userDao = userDao;
        this.bookDao = bookDao;
    }
}
