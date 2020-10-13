package com.wxf.controller;

import com.wxf.dao.UserDao;
import com.wxf.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    @Test
    public void testDemo01() throws IOException {
        // 获取读取mybatis配置文件的流对象
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
        // 构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resource);
        // 通过工厂获取连接对象
        SqlSession sqlSession = factory.openSession();
        // 通过连接对象获得接口实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.selectUserById(1);
        System.out.println(user);
    }
}
