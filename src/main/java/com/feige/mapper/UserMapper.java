package com.feige.mapper;


import com.feige.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper{
    @Select("SELECT * FROM user where id=#{id}")
    User findUserById(@Param("id") int id);

    @Select("SELECT * FROM user")
    List<User> findAll();


}
