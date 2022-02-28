package mybatis;

import com.camille.mybatis.mapper.EmpMapper;
import com.camille.mybatis.pojo.Emp;
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

        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println(emp);

        List<Emp> emps = mapper.selectAll();
        emps.forEach(emp1 -> System.out.println(emp1));

    }

}
