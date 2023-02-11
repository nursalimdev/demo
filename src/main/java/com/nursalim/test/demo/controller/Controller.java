package com.nursalim.test.demo.controller;

import com.nursalim.test.demo.entity.User;
import com.nursalim.test.demo.entity.UserContact;
import com.nursalim.test.demo.service.UserContactService;
import com.nursalim.test.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class Controller {
    private UserService userService;
    private UserContactService userContactService;

    public Controller(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/user-contacts")
    public List<UserContact> getAllUserContact(){
        return userContactService.getAllUserContact();
    }
}
