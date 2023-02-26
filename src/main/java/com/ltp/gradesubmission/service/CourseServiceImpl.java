package com.ltp.gradesubmission.service;

import java.util.List;
import java.util.Optional;

import com.ltp.gradesubmission.entity.Course;
import com.ltp.gradesubmission.exception.CourseNotFoundException;
import com.ltp.gradesubmission.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    CourseRepository courseRepository;

    @Override
    public Course getCourse(Long id) {
        Optional<Course> course = courseRepository.findById(id);
        if(course.isPresent()){
            return course.get();
        }
        else {
            throw new CourseNotFoundException(id);
        }
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id)
    {
        courseRepository.findById(id);
    }

    @Override
    public List<Course> getCourses() {
        return (List<Course>)courseRepository.findAll(); //typecast iterable to list
    }

}