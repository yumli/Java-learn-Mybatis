package com.camille.mybatis.test;

import com.camille.mybatis.mapper.EmpMapper;
import com.camille.mybatis.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Camille
 * @create 2022-02-27 22:00
 */
public class TestMbG {

    /**
     * 测试mybatis的一级缓存和二级缓存
     */
    @Test
    public void testMBG(){

        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory sqlSessionFactory1 = new SqlSessionFactoryBuilder().build(is);


            SqlSession sqlSession1 = sqlSessionFactory1.openSession(true);
            SqlSession sqlSession2 = sqlSessionFactory1.openSession(true);

            EmpMapper mapper1 = sqlSession1.getMapper(EmpMapper.class);
            Emp emp = mapper1.selectByPrimaryKey(1);
            System.out.println(emp);
            sqlSession1.close();
//            int i = mapper1.updateByPrimaryKey(new Emp(1,"Susan",3000.23,10));
            EmpMapper mapper2 = sqlSession2.getMapper(EmpMapper.class);
            Emp emp2 = mapper2.selectByPrimaryKey(1);
            System.out.println(emp2);



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
