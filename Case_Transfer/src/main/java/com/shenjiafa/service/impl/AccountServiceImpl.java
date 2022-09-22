package com.shenjiafa.service.impl;

import com.shenjiafa.mapper.AccountLogMapper;
import com.shenjiafa.mapper.AccountTransferMapper;
import com.shenjiafa.service.AccountLogService;
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
    private AccountTransferMapper accountTransferMapper;
    @Autowired
    private AccountLogService accountLogService;

    @Override
    public void transfer(String in, String out, Double money) {

        try {
            accountTransferMapper.outMoney(out, money);
            accountTransferMapper.inMoney(in, money);
        } finally {
            accountLogService.log(in, out, money);
        }

    }
}
