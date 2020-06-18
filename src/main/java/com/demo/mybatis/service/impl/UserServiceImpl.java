package com.demo.mybatis.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.demo.mybatis.dao.UserDao;
import com.demo.mybatis.entity.UserEntity;
import com.demo.mybatis.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    @Override
    public List<UserEntity> getAllUser() {
        return baseMapper.getAllUser();
    };

    @Override
    public List<UserEntity> getUserById(String id) {
        return baseMapper.getUserById(id);
    }
}
