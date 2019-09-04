package com.example.dockertest.controller;

import com.example.dockertest.model.User;
import com.example.dockertest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jayMamba
 * @date 2019/9/4
 * @time 16:03
 * @desc
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserInfo")
    public User getUserInfoById() {
        return userService.getUserInfo();
    }
}
