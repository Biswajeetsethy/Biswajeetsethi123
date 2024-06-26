package com.course.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable>{

}
