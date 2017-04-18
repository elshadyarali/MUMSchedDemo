package com.mumsched.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mumsched.domain.Course;
public interface CourseCRUD extends JpaRepository<Course, Long> {

	
	
}
