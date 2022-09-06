package com.shenjiafa.dao.impl;

import com.shenjiafa.dao.BookDao;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/5
 */
public class BookDaoImpl implements BookDao {

    private BookDaoImpl() {
        System.out.println("BookDaoImpl is running...");
    }

    @Override
    public void save() {
        System.out.println("BookDao save... ");
    }
}
