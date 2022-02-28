package com.camille.dao;

import com.camille.pojo.User;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * @author Camille
 * @create 2021-03-21 21:09
 */
public interface UserDao {
    //查询全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //insert插入一个用户
    int addUser(User user);

    //删除一个用户
    int deleteUser(int id);

    //修改一个用户
    int updateUser(User user);

    //使用map传参添加一个user
    int addUserByMap(Map<String,Object> map);

    //模糊查询用户
    List<User> getUserlike(String value);

}
