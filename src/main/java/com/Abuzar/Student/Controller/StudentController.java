package com.Abuzar.Student.Controller;

import com.Abuzar.Student.Entities.StudentEntity;
import com.Abuzar.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/students")
    public List<StudentEntity> getAllChallenges(){
        return studentService.getAllStudents();
    }


    @PostMapping("/students")
    public String addStudent(@RequestBody StudentEntity studentEntity){
        studentService.createStudent(studentEntity);
        return "Student created Successfully";
    }
}
