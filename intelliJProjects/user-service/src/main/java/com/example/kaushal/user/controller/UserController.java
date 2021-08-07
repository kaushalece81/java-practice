package com.example.kaushal.user.controller;

import com.example.kaushal.user.entity.User;
import com.example.kaushal.user.service.UserService;
import com.example.kaushal.user.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("inside saveUser of UserController");
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartmentByUserId(@PathVariable("id") Long userId){
        log.info("inside getUserWithDepartmentByUserId of UserController");
        return userService.getUserWithDepartmentByUserId(userId);
    }
}
