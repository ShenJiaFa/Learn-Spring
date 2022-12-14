package com.shenjiafa.service;

import com.shenjiafa.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    BookService bookService;

    @Test
    public void testFindById() {
        System.out.println(bookService.findById(1));
    }

    @Test
    public void testFindAll() {
        System.out.println(bookService.findAll());
    }

}
