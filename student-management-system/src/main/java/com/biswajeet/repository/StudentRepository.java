package com.biswajeet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biswajeet.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
