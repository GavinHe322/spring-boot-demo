package com.demo.mybatis.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.demo.mybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
    List<UserEntity> getAllUser();

    /**
     *
     * @param id
     * @return List
     */
    List<UserEntity> getUserById(@Param("id") String id);
}
