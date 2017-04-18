package com.mumsched.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumsched.domain.Course;
import com.mumsched.repository.CourseCRUD;

@Service
public class CourseServiceImpl  implements CourseService{

	@Autowired
	CourseCRUD crud;
	
	
public	Course getCourse(long Id)
	{
		return crud.findOne(Id);
	}


@Override
public void createNewCourse(Course course) {

   crud.save(course);
	
}


@Override
public List<Course> getAllCourses() {


	return crud.findAll();
}


@Override
public void deleteCourse(Long id) {
	  crud.delete(id);
	
}


@Override
public void updateCourse(Course course) {

          crud.save(course);
	
}
	
}
