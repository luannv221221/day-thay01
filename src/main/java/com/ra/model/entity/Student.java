package com.ra.model.entity;

public class Student {
    private int studentId;
    private String fullName;
    private Boolean sex;
    private int age;
    private String email;

    public Student() {
    }

    public Student(int studentId, String fullName, Boolean sex, int age, String email) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
