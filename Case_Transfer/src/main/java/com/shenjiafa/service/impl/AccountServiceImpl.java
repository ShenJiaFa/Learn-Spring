package com.shenjiafa.service.impl;

import com.shenjiafa.mapper.AccountDao;
import com.shenjiafa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/21
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public void transfer(String in, String out, Double money) {
        accountDao.outMoney(out,money);
        System.out.println(1 / 0);
        accountDao.inMoney(in,money);
    }
}
