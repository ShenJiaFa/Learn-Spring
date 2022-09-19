package com.shenjiafa.service;

import com.shenjiafa.domain.User;

import java.util.List;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/19
 */
public interface UserService {
    void add(User user);

    void delete(Integer id);

    void update(User user);

    User queryById(Integer id);

    List<User> queryAll();
}
