package com.springboot.mybatis.entity;

import lombok.Data;

@Data
public class User {
    private  Long userId;
    private String mobile;
    private String password;
    private String username;
    private String avatar;
}
