package com.Controller;

import com.Domain.User;
import com.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")

public class UserController {
    @Autowired
    private UserService userService;

   @PostMapping("/addUser")
    public void addUser(User user){
        userService.add();
    }
}
