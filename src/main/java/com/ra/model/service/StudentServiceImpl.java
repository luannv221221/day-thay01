package com.ra.model.service;

import com.ra.model.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Quỳnh Anh",false,19,"anh@gmail.com"));
        students.add(new Student(2,"Quỳnh Mai",true,20,"anh@gmail.com"));
        students.add(new Student(3,"Anh CM",false,19,"anh@gmail.com"));
        students.add(new Student(4,"KOKOKO",true,19,"anh@gmail.com"));
        students.add(new Student(5,"Đi Ké",false,19,"anh@gmail.com"));
        return students;
    }
}
