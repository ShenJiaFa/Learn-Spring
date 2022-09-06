package com.shenjiafa;

import com.shenjiafa.dao.OrderDao;
import com.shenjiafa.factory.OderDaoFactory;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/5
 */
public class RunAppShowStaticFactory {
    public static void main(String[] args) {
        OrderDao orderDao = OderDaoFactory.getOrderDao();
        orderDao.save();
    }
}
