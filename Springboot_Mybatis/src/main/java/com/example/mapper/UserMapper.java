package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
//@Repository
//@Component
@Mapper
public interface UserMapper {

    User Sel(int id);

    List<User> getAllUsers();

    int insertUser(User user);

    int update(User user);

    int delete(int id);


}
