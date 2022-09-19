package com.shenjiafa.mapper;

import com.shenjiafa.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/14
 */
@Repository
public interface BookMapper {

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
