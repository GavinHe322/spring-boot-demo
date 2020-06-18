package com.demo.mybatis.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("user")
public class UserEntity {
    @TableId
    private Long id;

    private String name;

    private String email;
}
