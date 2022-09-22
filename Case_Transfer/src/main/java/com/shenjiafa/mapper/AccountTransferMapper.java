package com.shenjiafa.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/21
 */
public interface AccountTransferMapper {

    @Update("update t_account set money = money + #{money} where name=#{name}")
    void inMoney(@Param("name") String name, @Param("money") double money);

    @Update("update t_account set money = money - #{money} where name=#{name}")
    void outMoney(@Param("name") String name, @Param("money") double money);

}
