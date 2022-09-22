package com.shenjiafa.service.impl;

import com.shenjiafa.mapper.AccountLogMapper;
import com.shenjiafa.service.AccountLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/22
 */
@Service
public class AccountLogImpl implements AccountLogService {

    @Autowired
    private AccountLogMapper accountLogMapper;


    @Override
    public void log(String in, String out, Double money) {
        accountLogMapper.log(out + "向" + in + "转账" + money + "元");
    }
}
