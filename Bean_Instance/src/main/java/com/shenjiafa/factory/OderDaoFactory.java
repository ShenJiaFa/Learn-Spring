package com.shenjiafa.factory;

import com.shenjiafa.dao.OrderDao;
import com.shenjiafa.dao.impl.OderDaoImpl;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/5
 */
public class OderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("OderDaoFactory running...");
        return new OderDaoImpl();
    }
}
