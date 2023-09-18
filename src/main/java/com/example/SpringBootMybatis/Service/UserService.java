package com.example.SpringBootMybatis.Service;

import com.example.SpringBootMybatis.Domain.User;
import com.example.SpringBootMybatis.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void add(User user) {
        userMapper.addUser(user);

    }

    public int delete(int id) {
        int delete = userMapper.deleteUser(id);
        return delete;
    }

    public int update(User user) {
        int delete = userMapper.updateUser(user);
        return delete;
    }
    public User detail(int id) {
        User user = userMapper.detailUser(id);
        return user;
    }
    public List<User> List() {
        List<User> list = userMapper.List();
        return list;
    }

}
