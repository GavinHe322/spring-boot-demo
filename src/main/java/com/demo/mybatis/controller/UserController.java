package com.demo.mybatis.controller;

import com.demo.mybatis.entity.UserEntity;
import com.demo.mybatis.service.UserService;
import com.demo.mybatis.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("getAllUser")
    public RestResponse getAllUser() {
        List<UserEntity> list = userService.getAllUser();
        System.out.println(list);
        return RestResponse.success().put("list", list);
    }

    @GetMapping("getUserById")
    public RestResponse getUserById(@RequestParam String id) {
        System.out.println(id);
        List<UserEntity> list = userService.getUserById(id);
        return RestResponse.success().put("list", list);
    }

}
