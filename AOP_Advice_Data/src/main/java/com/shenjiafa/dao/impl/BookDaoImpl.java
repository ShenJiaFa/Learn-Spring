package com.shenjiafa.dao.impl;

import com.shenjiafa.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/20
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(Integer id,String name) {
        System.out.println("id:"+id+" name:"+name);
        if(true){throw new NullPointerException();}
        return "com.shenjiafa";
    }
}
