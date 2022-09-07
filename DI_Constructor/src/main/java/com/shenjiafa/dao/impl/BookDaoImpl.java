package com.shenjiafa.dao.impl;

import com.shenjiafa.dao.BookDao;

/**
 * Function: 图书持久层实现类
 *
 * @author ShenJiaFa
 * @since 2022/9/7
 */
public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;

    public BookDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("BookDao save...[connectionNum=" + connectionNum + "]&[databaseName=" + databaseName + "]");
    }
}
