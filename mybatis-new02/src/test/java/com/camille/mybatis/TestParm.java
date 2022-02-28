package com.camille.mybatis;

import com.camille.mybatis.mapper.UserMapper;
import com.camille.mybatis.pojo.User;
import com.camille.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Camille
 * @create 2022-02-24 20:53
 */
public class TestParm {

    /**
     * 测试使用封装后的工具类 SqlSessionUtils 连接成功
     */
    @Test
    public void test01(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserList();
        userList.forEach(user -> System.out.println(user.toString()));

    }

    /**
     * 测试 Mybatis 获取参数的各种情况
     * 情况1：单个参数
     * 情况2：多个参数
     */
    @Test
    public void test02(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user1 = mapper.getUserByName("zhangsan");

        System.out.println(user1.toString());

        User user2 = mapper.checkLogin("zhangsan", 123);
        System.out.println(user2.toString());

    }

    /**
     * 情况3：使用map封装
     * 情况4：实体类封装
     */
    @Test
    public void test03(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String,Object> userMap = new HashMap();
        userMap.put("username","zhangsan");
        userMap.put("password", 123);

        User user2 = mapper.checkLoginByMap(userMap);
        System.out.println(user2.toString());

        int i = mapper.insertUser(new User(null,"李四", "123@qq.com","123",22, "男"));

    }

    /**
     * 情况5 ：使用@Param 注解
     */
    @Test
    public void test04(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String,Object> userMap = new HashMap();
        userMap.put("username","zhangsan");
        userMap.put("password", 123);

        User user2 = mapper.checkLoginByMap(userMap);
        User user3 = mapper.checkLoginByParam("zhangsan","123");
        System.out.println(user2.toString()+"\n"+user3.toString());

    }

}
