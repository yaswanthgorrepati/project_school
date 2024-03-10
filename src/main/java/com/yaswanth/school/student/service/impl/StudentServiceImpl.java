package com.yaswanth.school.student.service.impl;

import com.yaswanth.school.student.entities.Student;
import com.yaswanth.school.student.repository.StudentDAO;
import com.yaswanth.school.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;
    @Override
    public Student getStudentById(Long id) {
        Optional<Student> student = studentDAO.findById(id);
        return student.isPresent() ?  student.get() : null;
    }
}
