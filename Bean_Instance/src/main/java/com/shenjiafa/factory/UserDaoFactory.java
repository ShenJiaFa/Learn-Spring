package com.shenjiafa.factory;

import com.shenjiafa.dao.OrderDao;
import com.shenjiafa.dao.UserDao;
import com.shenjiafa.dao.impl.OderDaoImpl;
import com.shenjiafa.dao.impl.UserDaoImpl;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/5
 */
public class UserDaoFactory {
    public UserDao getUserDao() {
        System.out.println("UserDaoFactory running...");
        return new UserDaoImpl();
    }
}
