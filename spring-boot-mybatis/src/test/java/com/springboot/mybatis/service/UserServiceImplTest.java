package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

@Resource
private UserService userService;

    @Test
    public void selectAll() {
        List<User> userList=userService.selectAll();
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void getOne() {
        User user=userService.getOne(1L);
        System.out.println(user);
    }

    @Test
    public void delete() {
        userService.delete(3L);
    }

    @Test
    public void insert() {
        User user = new User();
        user.setMobile("18351897198");
        user.setPassword("999999");
        user.setUsername("李老师");
        user.setAvatar("user5.jpg");
        userService.insert(user);
    }

    @Test
    public void update() {
      User user=userService.getOne(5L);
      user.setAvatar("user6.jpg");
      user.setPassword("333333");
      userService.update(user);
    }
}