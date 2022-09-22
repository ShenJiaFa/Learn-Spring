package com.shenjiafa.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/22
 */
public interface AccountLogMapper {
    @Insert("insert into t_account_log (info,create_time) values (#{info},now())")
    void log(@Param("info") String info);
}
