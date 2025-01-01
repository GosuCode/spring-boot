package com.example.demo.service;

import com.example.demo.model.StudentModel;

import java.util.List;

public interface StudentService {
    StudentModel addData(StudentModel student);
    StudentModel updateData(Long id, StudentModel student);
    void deleteData(Long id);
    StudentModel getData(Long id);
    List<StudentModel> getAllData();
}
