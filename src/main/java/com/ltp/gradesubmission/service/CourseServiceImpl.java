package com.ltp.gradesubmission.service;

import java.util.List;

import com.ltp.gradesubmission.entity.Course;
import com.ltp.gradesubmission.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepository courseRepository;

    @Override
    public Course getCourse(Long id) {
        return null;
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id)
    {
    }

    @Override
    public List<Course> getCourses() {
        return null;
    }

}