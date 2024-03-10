package com.yaswanth.school.student.controller;

import com.yaswanth.school.student.entities.Student;
import com.yaswanth.school.student.response.StudentResponse;
import com.yaswanth.school.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<StudentResponse> getStudentById(@PathVariable(name = "id") long studentId){
        Student student = studentService.getStudentById(studentId);
        StudentResponse studentResponse = new StudentResponse(student.getId(), student.getName(), student.getStandard(), student.getSection());
        return new ResponseEntity<>(studentResponse, HttpStatus.OK);
    }
}
