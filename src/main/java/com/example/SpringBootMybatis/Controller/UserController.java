package com.example.SpringBootMybatis.Controller;

import com.example.SpringBootMybatis.Domain.User;
import com.example.SpringBootMybatis.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class UserController {
    public String message = "操作成功";
    @Autowired
    private UserService userService;

    /**
     * 新增
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    @ResponseBody
    public String addUser(@RequestBody User user) {
        try {
            userService.add(user);
        } catch (Exception e) {
            message = "操作失败";
        }
        return message;
    }

    /**
     * 删除
     * @param user
     * @return
     */
    @RequestMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(@RequestBody User user) {
        try {
            userService.delete(user.getId());
        } catch (Exception e) {
            message = "操作失败";
        }
        return message;
    }

    /**
     * 修改
     * @param user
     * @return
     */
    @RequestMapping("/updateUser")
    @Transactional
    @ResponseBody
    public String updateUser(@RequestBody User user,@RequestParam String in,@RequestParam String out) {
        try {
            userService.update(user);
        } catch (Exception e) {
            message = "操作失败";
        }
        return message;
    }

    /**
     * 查看
     * @param user
     * @return
     */
    @RequestMapping("/detailUser")
    @ResponseBody
    public User detailUser(@RequestBody User user) {
        User detail = userService.detail(user.getId());
        return detail;
    }

    /**
     * 查看全部
     * @return
     */
    @RequestMapping("/List")
    @ResponseBody
    public List<User> detailUser() {
        List<User> list = userService.List();
        return list;
    }
}
