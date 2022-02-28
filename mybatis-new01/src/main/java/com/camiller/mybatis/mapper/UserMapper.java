package com.camiller.mybatis.mapper;

import com.camiller.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.omg.PortableInterceptor.USER_EXCEPTION;

import java.util.List;

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

}
