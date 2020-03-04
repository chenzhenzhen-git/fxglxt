package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class UserController {
    @Resource
    UserService userServiceImpl;

    @PostMapping("/seluser")
    public void seluser() {
         User user= userServiceImpl.selectByPrimaryKey(1);
        System.out.println(user.getUserName());
    }
}
