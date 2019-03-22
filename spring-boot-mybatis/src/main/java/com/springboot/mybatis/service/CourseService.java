package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.entity.CourseVO;
import com.springboot.mybatis.entity.CourseVO1;

import java.util.List;

public interface CourseService {
    List<CourseVO> selectCurrentCourses();

    List<CourseVO1> selectFinshedCourses();

    List<Course> selectAll();

    Course getOne(long courseId);

    void delete(long courseId);

    Course insert(Course course);

    void update(Course course);
}
