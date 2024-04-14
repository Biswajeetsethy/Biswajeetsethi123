package com.course.service;

import java.util.List;

import com.course.entity.Course;

public interface CourseService {
	//For both update & insert
	public String upsert(Course course);
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourses();
	
	public String deleteById(Integer cid);


}
