package com.shenjiafa.dao.impl;

import com.shenjiafa.dao.UserDao;
import org.springframework.stereotype.Service;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/17
 */
@Service
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("UserDaoImpl is saving...");
    }

    @Override
    public int select() {
        System.out.println("UserDaoImpl is selecting...");
        return 0;
    }
}
