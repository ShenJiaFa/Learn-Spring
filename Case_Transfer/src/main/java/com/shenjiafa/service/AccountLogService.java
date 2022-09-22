package com.shenjiafa.service;

import org.apache.ibatis.annotations.Param;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/22
 */
public interface AccountLogService {
    void log(String in, String out, Double money);
}
