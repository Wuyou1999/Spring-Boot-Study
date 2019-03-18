package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.util.RandomUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceImplTest {
   @Resource
    private CourseService courseService;

    @Test
    public void selectAll() {
        List<Course> courseList=courseService.selectAll();
        courseList.forEach(course -> System.out.println(course));
    }

    @Test
    public void getOne() {
        Course course=courseService.getOne(1L);
        System.out.println(course);
    }

    @Test
    public void delete() {
        courseService.delete(6L);
    }

    @Test
    public void insert() {
        Course course=new Course();
        course.setCourseName("微信小程序开发");
        course.setCourseClass("软件1721");
        course.setUserId(6L);
        course.setCover("6.jpg");
        course.setCourseCode(RandomUtil.getRandomCode());
        course.setFinished((short)0);
        courseService.insert(course);
    }
    @Test
    public void update() {
        Course course = courseService.getOne(7L);
        course.setCover("100.jpg");
        course.setFinished((short) 1);
        courseService.update(course);
    }
}