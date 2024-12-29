package com.example.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
public class StudentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	String id;
	String name;
	String rollNo;
	String address;
	List<String> hobbies;
	
	
	//	id => name
	// address => list of user

}
