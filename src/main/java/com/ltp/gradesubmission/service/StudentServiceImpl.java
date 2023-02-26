package com.ltp.gradesubmission.service;

import java.util.List;
import java.util.Optional;

import com.ltp.gradesubmission.entity.Grade;
import com.ltp.gradesubmission.entity.Student;
import com.ltp.gradesubmission.exception.StudentNotFoundException;
import com.ltp.gradesubmission.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
//    @Autowired
    StudentRepository studentRepository;

//    @Override
    public Student getStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);
//        printGrades(studentRepository.findById(id).get());
       if (student.isPresent()){
            return student.get();
       }else {
         throw new StudentNotFoundException(id);
       }

    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
         studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
    }


//    to test the 2 way relation
//    public void printGrades(Student student){
//        for (Grade grade: student.getGrades()){
//            System.out.println(grade.getScore());
//
//        }
//    }

}