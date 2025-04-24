package com.Abuzar.Student.Controller;

import com.Abuzar.Student.Entities.StudentEntity;
import com.Abuzar.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }


    @GetMapping("/students")
    public List<StudentEntity> getAllChallenges(){
        return studentService.getAllStudents();
    }


    @PostMapping("/students")
    public String addStudent(@RequestBody StudentEntity studentEntity){
        studentService.createStudent(studentEntity);
        return "Student created Successfully";
    }

    @GetMapping("/students/{id}")
    public StudentEntity getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }
}
