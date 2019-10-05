package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;


    public User Sel(int id){
        return userMapper.Sel(id);
    }


    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }

    public int insertUser(User user){
        return userMapper.insertUser(user);
    }

    public int update(User user){
        return userMapper.update(user);
    }


    public int delete(int id){
        return userMapper.delete(id);
    }
}
