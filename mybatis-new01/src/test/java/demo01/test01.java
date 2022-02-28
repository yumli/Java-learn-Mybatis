package demo01;

import com.camiller.mybatis.entity.User;
import com.camiller.mybatis.mapper.UserMapper;
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
 * @create 2022-02-23 22:16
 */
public class test01 {

    @Test
    public void InsertTest() throws IOException {

        //1、MyBatis的核心配置文件路径
        String resource = new String("mybatis-config.xml");
        /**
         *2、读取MyBatis的核心配置文件
         *   MyBatis 包含一个名叫 Resources 的工具类，它包含一些实用方法，可以方便的从类路径或其它位置加载资源文件
         */
        InputStream is = Resources.getResourceAsStream(resource);
        //3、从 XML 文件中构建 sqlSessionFactoryBuilder 的实例
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //4、通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);

        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //5、创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //6、通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //7、调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配
        //映射文件中的SQL标签，并执行标签中的SQL语句
//        int result = userMapper.insertUser();
//        userMapper.deletUser(1);
//        userMapper.updateUser();
        User user = userMapper.getUserById(2);
        System.out.println(user.toString());
        List<User> userList = userMapper.getUserList();
        System.out.println(userList);
        //sqlSession.commit();
    }

}
