package com.ra.model.service;

import com.ra.model.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student findById(int id);
}
