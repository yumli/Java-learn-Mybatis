package Dao;

import com.camille.dao.UserMapper;
import com.camille.pojo.User;
import com.camille.utils.mybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Camille
 * @create 2021-03-21 21:22
 */
public class DaoTest {

    static Logger logger = Logger.getLogger(DaoTest.class); //LogDemo为相关的类

    //根据Id查询一个user对象
    @Test
    public void test01() {

        //第一步：获取SqlSession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user1 = userMapper.getUserById(1);
            System.out.println(user1);

            logger.info("info:进入了日志");
            logger.debug("debug:进入了日志");
            logger.error("error:进入了日志");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test02() {
        //第一步：获取SqlSession对象

        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            //方式一：getMapper
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("startindex", 1);
            map.put("sizeperpage", 2);
            List<User> userList = userDao.getUserBylimit(map);

            for (User user : userList) {
                System.out.println(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    //分页查询
    @Test
    public void test03() {
        //第一步：获取SqlSession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            RowBounds rowBounds = new RowBounds(0, 1);
            //方式一：
//            List<User> userList = sqlSession.selectList("com.camille.dao.UserMapper.getUserByRowBounds");//全部查询
            List<User> userList = sqlSession.selectList("com.camille.dao.UserMapper.getUserByRowBounds", null, rowBounds);
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test04() {
        //第一步：获取SqlSession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUser();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
