package com.shenjiafa.factory;

import com.shenjiafa.dao.UserDao;
import com.shenjiafa.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/6
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDaoImpl.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

}
