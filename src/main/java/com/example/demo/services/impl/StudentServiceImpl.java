package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.StudentModel;
import com.example.demo.repository.StudentRepository;
import com.example.demo.services.StudentServices;

@Service
public class StudentServiceImpl implements StudentServices {
	
	@Autowired
	StudentRepository student_repo;

	@Override
	public StudentModel addData(StudentModel student) {
		StudentModel save = student_repo.save(student);
		return save;
	}
	
	@Override
	public List<StudentModel> listAllData() {
		return student_repo.findAll();
	}

	@Override
	public StudentModel findById(String id) {
		return student_repo.findById(id).orElse(null) ;
	}
		
	@Override
	public List<StudentModel>findUserByName(String name) {
		return student_repo.findUserByName(name);
	}

}
