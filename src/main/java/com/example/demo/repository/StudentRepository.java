package com.example.demo.repository;

import com.example.demo.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {
}
