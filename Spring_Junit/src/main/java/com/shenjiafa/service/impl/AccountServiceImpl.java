package com.shenjiafa.service.impl;

import com.shenjiafa.mapper.AccountMapper;
import com.shenjiafa.pojo.Account;
import com.shenjiafa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/14
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) {
        accountMapper.save(account);
    }

    @Override
    public void delete(Integer id) {
        accountMapper.delete(id);
    }

    @Override
    public void update(Account account) {
        accountMapper.update(account);
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }

    @Override
    public Account findById(Integer id) {
        return accountMapper.findById(id);
    }
}
