package com.example.demo.services;

import java.util.List;

import com.example.demo.models.StudentModel;

public interface StudentServices {
	StudentModel addData(StudentModel student);
	
	List<StudentModel> listAllData();

	StudentModel findById(String id);
	
	List<StudentModel> findUserByName(String name);
	
}
