package com.Abuzar.Student.Service;

import com.Abuzar.Student.Entities.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private float nextId = 1L;

    private List<StudentEntity> student = new ArrayList<>();

    public List<StudentEntity> getAllStudents(){
        return student;
    }



    public boolean createStudent(StudentEntity studentEntity) {
        if(studentEntity != null){
            student.add(studentEntity);
            return true;
        }else {
            return false;
        }

    }
}
