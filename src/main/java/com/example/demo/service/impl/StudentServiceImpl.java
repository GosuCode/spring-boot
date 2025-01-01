package com.example.demo.service.impl;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository students;

    @Override
    public StudentModel addData(StudentModel student) {
        return students.save(student);
    }

    @Override
    public StudentModel updateData(Long id, StudentModel student) {
        if(students.existsById(id)){
            student.setId(id);
            return students.save(student);
        }
        throw new RuntimeException("Student with ID " + id + " not found");
    }

    @Override
    public void deleteData(Long id) {
        if(students.existsById(id)){
            students.deleteById(id);
        }
        else {
        throw new RuntimeException("Student with id "+ id + " not found");
        }
    }

    @Override
    public StudentModel getData(Long id) {
        return students.findById(id).orElseThrow(()-> new RuntimeException("Student with id "+ id +" not found"));
    }

    @Override
    public List<StudentModel> getAllData() {
        return students.findAll();
    }
}
