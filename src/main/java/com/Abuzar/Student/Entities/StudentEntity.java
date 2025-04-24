package com.Abuzar.Student.Entities;

public class StudentEntity {

    private int id;
    private String name;
    private int rollNo;
    private String email;

    public StudentEntity(){

    }

    public StudentEntity(int id, String name, int rollNo, String email) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
