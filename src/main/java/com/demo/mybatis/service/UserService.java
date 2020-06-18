package com.demo.mybatis.service;

import com.baomidou.mybatisplus.service.IService;
import com.demo.mybatis.entity.UserEntity;

import java.util.List;

public interface UserService extends IService<UserEntity> {
    List<UserEntity> getAllUser();
    List<UserEntity> getUserById(String id);
}
