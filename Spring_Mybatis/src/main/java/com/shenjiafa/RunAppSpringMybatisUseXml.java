package com.shenjiafa;

import com.shenjiafa.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/14
 */
public class RunAppSpringMybatisUseXml {
    public static void main(String[] args) throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        System.out.println(accountMapper.findById(1));
        sqlSession.close();
    }
}
