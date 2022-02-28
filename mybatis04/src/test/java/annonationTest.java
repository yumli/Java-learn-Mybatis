import com.camille.dao.UserMapper;
import com.camille.pojo.User;
import com.camille.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;



/**
 * @author Camille
 * @create 2021-03-24 19:23
 */
public class annonationTest {

    @Test
    public void test1() {
        //第一步：获取SqlSession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//            mapper.addUser(new User(6, "dada", "111"));
//            mapper.deleteUser(6);
            mapper.udateUser(new User(5,"hoho","888888"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
