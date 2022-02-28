package com.camille.Dao;


import com.camille.dao.UserMapper;
import com.camille.pojo.User;
import com.camille.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Camille
 * @create 2021-03-21 21:22
 */
public class DaoTest {

    //根据Id查询一个user对象
    @Test
    public void test02(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user1 = userMapper.getUserById(1);
            System.out.println(user1);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

}
