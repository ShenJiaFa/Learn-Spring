package com.shenjiafa.service;

import com.shenjiafa.domain.Book;

import java.util.List;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/14
 */
public interface BookService {
    /**
     * 添加账户
     *
     * @param book 账户
     */
    void save(Book book);

    /**
     * 删除账户
     *
     * @param id id
     */
    void delete(Integer id);

    /**
     * 更新账户
     *
     * @param book 账户
     */
    void update(Book book);

    /**
     * 查询所有账户
     *
     * @return 账户列表
     */
    List<Book> findAll();

    /**
     * 根据id查询账户
     *
     * @return 账户
     */
    Book findById(Integer id);
}
