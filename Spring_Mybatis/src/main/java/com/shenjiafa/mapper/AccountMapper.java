package com.shenjiafa.mapper;

import com.shenjiafa.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/14
 */
@Repository
public interface AccountMapper {

    /**
     * 添加账户
     *
     * @param account 账户
     */
    @Insert("insert into t_account values(#{account.id},#{account.name},#{account.money})")
    void save(Account account);

    /**
     * 删除账户
     *
     * @param id id
     */
    @Delete("delete from t_account where id=#{id}")
    void delete(Integer id);

    /**
     * 更新账户
     *
     * @param account 账户
     */
    @Update("update t_account set name = #{account.name}, price = #{account.money} where id=#{account.id}")
    void update(Account account);

    /**
     * 查询所有账户
     *
     * @return 账户列表
     */
    @Select("select * from t_account")
    List<Account> findAll();

    /**
     * 根据id查询账户
     *
     * @return 账户
     */
    @Select("select * from t_account where id=#{id}")
    Account findById(Integer id);

}
