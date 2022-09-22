package com.shenjiafa.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/22
 */
public interface AccountLogService {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void log(String in, String out, Double money);
}
