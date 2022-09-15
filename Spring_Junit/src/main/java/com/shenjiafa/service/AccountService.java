package com.shenjiafa.service;

import com.shenjiafa.pojo.Account;

import java.util.List;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/14
 */
public interface AccountService {
    /**
     * 添加账户
     *
     * @param account 账户
     */
    void save(Account account);

    /**
     * 删除账户
     *
     * @param id id
     */
    void delete(Integer id);

    /**
     * 更新账户
     *
     * @param account 账户
     */
    void update(Account account);

    /**
     * 查询所有账户
     *
     * @return 账户列表
     */
    List<Account> findAll();

    /**
     * 根据id查询账户
     *
     * @return 账户
     */
    Account findById(Integer id);
}
