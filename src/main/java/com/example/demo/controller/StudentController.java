package com.example.demo.controller;

import com.example.demo.model.StudentModel;
import com.example.demo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public StudentModel addData(@RequestBody StudentModel student){
        return studentService.addData(student);
    }

    @PutMapping("/{id}")
    public StudentModel updateData(@PathVariable("id") Long id, @RequestBody StudentModel student){
        return studentService.updateData(id, student);
    }

    @GetMapping("/{id}")
    public StudentModel getData(@PathVariable("id") Long id){
        return studentService.getData(id);
    }

    @DeleteMapping("/{id}")
    public String deleteData(@PathVariable("id") Long id){
        studentService.deleteData(id);
        return "Student with Id " + id + " deleted successfully";
    }
    
    @GetMapping
    public List<StudentModel> getAllData(){
    	return studentService.getAllData();
    }

}
