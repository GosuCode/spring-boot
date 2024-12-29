package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.StudentModel;
import com.example.demo.services.StudentServices;

//@RestController
@Controller
public class StudentController {

	@Autowired
	StudentServices student_services;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/students")
	public StudentModel addData(@RequestBody StudentModel student) {
		return student_services.addData(student);
	}

//	@GetMapping("/listAll")
//	public List<StudentModel> listAllData() {
//		return student_services.listAllData();
//	}

	@GetMapping("/students")
	public String listAllData(Model m) {
		List<StudentModel> allStudent = student_services.listAllData();
		System.out.println(allStudent);
		m.addAttribute("student", allStudent);
		m.addAttribute("totalStudents", allStudent.size());
		return "students";
	}

	@GetMapping("/students/{id}")
	public StudentModel findById(@PathVariable("id") String id) {
		return student_services.findById(id);
	}

	@GetMapping("/students/{id}/{name}")
	public String printPath(@PathVariable("id") Long id, @PathVariable("name") String name) {
		return id + " " + name;
	}

	@GetMapping("/students/name/{name}")
	public List<StudentModel> findUserByName(@PathVariable("name") String name) {
		return student_services.findUserByName(name);
	}

}
