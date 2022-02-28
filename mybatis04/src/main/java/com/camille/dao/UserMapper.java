package com.camille.dao;



import com.camille.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author Camille
 * @create 2021-03-21 21:09
 */
public interface UserMapper {
    //查询全部用户
    List<User> getUserBylimit(Map<String, Integer> map);

    //根据id查询用户
    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);

    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int udateUser(User user);

    //分页查询
    List<User> getUserByRowBounds();

    @Select("select * from mybatis.user")
    List<User> getUser();



}
