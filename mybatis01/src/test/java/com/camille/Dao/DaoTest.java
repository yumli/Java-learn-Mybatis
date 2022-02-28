package com.camille.Dao;

import com.camille.dao.UserDao;
import com.camille.pojo.User;
import com.camille.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Camille
 * @create 2021-03-21 21:22
 */
public class DaoTest {

    //查询所有的user对象
    @Test
    public void test(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            //方式一：getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

            //方式二：
//            List<User> userList = sqlSession.selectList("com.com.camille.dao.UserDao.getUserList");

            for (User user : userList) {
                System.out.println(user);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }


    }
    //根据Id查询一个user对象
    @Test
    public void test02(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            User user1 = userDao.getUserById(1);
            System.out.println(user1);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    //inse插入一个user对象数据
    @Test
    public void test03(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            int userid = userDao.addUser(new User(4, "赵六", "123456"));
            System.out.println(userid);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //提交事务
            sqlSession.commit();
            sqlSession.close();
        }
    }

    //delete删除一个user对象数据
    @Test
    public void test04(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            int userid = userDao.deleteUser(4);
            System.out.println(userid);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //提交事务
            sqlSession.commit();
            sqlSession.close();
        }
    }

    //update修改一个user对象
    @Test
    public void test05(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            int userid = userDao.updateUser(new User(4,"赵无极","110110"));
            System.out.println(userid);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //提交事务
            sqlSession.commit();
            sqlSession.close();
        }
    }

    //使用Map传参添加一个user
    @Test
    public void test06(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("userid",5);
            map.put("username","王八");


            int userid = userDao.addUserByMap(map);
            System.out.println(userid);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //提交事务
            sqlSession.commit();
            sqlSession.close();
        }
    }

    //模糊查询
    @Test
    public void test07(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> userList = userDao.getUserlike("%李%");

            for (User user : userList) {
                System.out.println(user);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
