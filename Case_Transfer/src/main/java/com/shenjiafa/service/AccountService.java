package com.shenjiafa.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/21
 */
public interface AccountService {
    /**
     * 转账操作
     * @param in 转入放
     * @param out 转出方
     * @param money 转账金额
     */
    @Transactional
    void transfer(String in, String out, Double money);
}
