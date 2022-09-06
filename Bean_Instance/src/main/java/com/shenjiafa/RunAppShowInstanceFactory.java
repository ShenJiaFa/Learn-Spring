package com.shenjiafa;

import com.shenjiafa.dao.UserDao;
import com.shenjiafa.factory.UserDaoFactory;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/5
 */
public class RunAppShowInstanceFactory {
    public static void main(String[] args) {
        UserDaoFactory userDaoFactory = new UserDaoFactory();
        UserDao userDao = userDaoFactory.getUserDao();
        userDao.save();
    }
}
