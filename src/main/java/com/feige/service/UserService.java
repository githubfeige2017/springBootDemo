package com.feige.service;

import com.feige.mapper.UserMapper;
import com.feige.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public User queryById(int id)
    {

        return this.userMapper.findUserById(id);
    }

    public List<User> queryAll(){
        return this.userMapper.findAll();
    }

}
