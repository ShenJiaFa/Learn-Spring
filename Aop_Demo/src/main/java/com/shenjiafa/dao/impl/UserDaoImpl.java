package com.shenjiafa.dao.impl;

import com.shenjiafa.dao.UserDao;
import org.springframework.stereotype.Service;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/15
 */
@Service
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDao save...");
    }

    @Override
    public void update() {
        long start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println("UserDao update...");
    }
}
