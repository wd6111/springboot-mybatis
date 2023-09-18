package com.example.SpringBootMybatis.Mapper;

import com.example.SpringBootMybatis.Domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper {
    void addUser(User user);
    int deleteUser(int id);
    int updateUser(User user);
    User detailUser(int id);
    List<User>List();
}
