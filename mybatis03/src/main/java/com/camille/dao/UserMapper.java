package com.camille.dao;



import com.camille.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author Camille
 * @create 2021-03-21 21:09
 */
public interface UserMapper {
    //查询全部用户
    List<User> getUserBylimit(Map<String,Integer> map);

    //根据id查询用户
    User getUserById(int id);

    //分页查询
    List<User> getUserByRowBounds();

    @Select("select * from mybatis.user")
    List<User> getUser();

}
