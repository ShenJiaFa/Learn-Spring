package com.shenjiafa;

import com.shenjiafa.service.UserService;
import com.shenjiafa.service.impl.UserServiceImpl;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/3
 */
public class RunAppNotUseSpring {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.save();
    }
}
