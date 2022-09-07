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

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("BookDao save...[connectionNum=" + connectionNum + "]&[databaseName=" + databaseName + "]");
    }
}
