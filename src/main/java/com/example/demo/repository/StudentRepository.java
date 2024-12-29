package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, String> {
	
	List<StudentModel> findNameById(String id);
	
	List<StudentModel> findUserByName(String name);
	
}
