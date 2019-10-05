package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }


    @RequestMapping("getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping("/add")
    public int insertUser(User user){
        return userService.insertUser(user);
    }

    @RequestMapping("/update")
    public int update(User user){
        return userService.update(user);
    }

    @RequestMapping("/delete/{id}")
    public int deleteUserById(@PathVariable int id){
        return userService.delete(id);
    }
}
