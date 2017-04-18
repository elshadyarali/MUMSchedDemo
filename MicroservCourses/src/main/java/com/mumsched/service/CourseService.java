package com.mumsched.service;

import java.util.List;

import com.mumsched.domain.Course;

public interface CourseService {

	Course getCourse(long Id);
	
	List<Course> getAllCourses();
	void   createNewCourse(Course course);
	void   updateCourse(Course course);
	void   deleteCourse(Long id);
	
}
