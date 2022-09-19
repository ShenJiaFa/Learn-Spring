package com.shenjiafa;

import com.shenjiafa.config.SpringConfig;
import com.shenjiafa.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class InterfaceRunSpeedTest {
    @Autowired
    private UserService userService;

    @Test
    public void testQueryById() {
        userService.queryById(1);
    }

    @Test
    public void testQueryAll() {
        userService.queryAll();
    }

}
