package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.entity.CourseVO;
import com.springboot.mybatis.entity.CourseVO1;
import com.springboot.mybatis.mapper.CourseMapper;
import com.springboot.mybatis.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<Course> selectAll() {
        return courseMapper.selectAll();
    }

    @Override
    public Course getOne(long courseId) {
        return courseMapper.getOne(courseId);
    }

    @Override
    public List<CourseVO> selectCurrentCourses() {
        return courseMapper.selectCurrentCourses();
    }

    @Override
    public List<CourseVO1> selectFinshedCourses() {
        return courseMapper.selectFinshedCourses();
    }

    @Override
    public void delete(long courseId) {
        courseMapper.delete(courseId);
    }

    @Override
    public Course insert(Course course) {
        courseMapper.insert(course);
        return course;
    }

    @Override
    public void update(Course course) {
        courseMapper.update(course);
    }
}
