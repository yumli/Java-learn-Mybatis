package com.camille.mybatis.mapper;


import com.camille.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Camille
 * @create 2022-02-23 22:03
 */

public interface UserMapper {

    /**
     *添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 根据 id 删除用户信息
     * @param id
     * @return
     */
    int deletUser(@Param("id") int id);

    int updateUser();

    User getUserById(@Param("id") int id);

    List<User> getUserList();

    User getUserByName(String username);

    User checkLogin(String username,int password);

    User checkLoginByMap(Map map);

    int insertUser(User user);

    User checkLoginByParam(@Param("username") String username,@Param("password") String password);


}
