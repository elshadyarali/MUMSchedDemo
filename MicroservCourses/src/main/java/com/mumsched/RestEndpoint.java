package com.mumsched;


import java.io.IOException;
import java.net.URI;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.mumsched.domain.Course;
import com.mumsched.service.CourseService;
import com.mumsched.service.CourseServiceImpl;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/")
public class RestEndpoint {

	@Autowired
	CourseService service;
	
 
  @RequestMapping(value="/courses/get/{courseid}",method = RequestMethod.GET)
  ResponseEntity<Course> getCourse(@PathVariable("courseid") Long id){
	  //System.out.println(id);
	  return new ResponseEntity<>(service.getCourse(id),HttpStatus.OK);
	  
  }	

  @RequestMapping(value="/courses",method = RequestMethod.GET)
  ResponseEntity<List<Course>> getCourses(){
	  //System.out.println(id);
	  return new ResponseEntity<>(service.getAllCourses(),HttpStatus.OK);
	  
  }
  

  
  @RequestMapping(value="/courses/add",method = RequestMethod.POST,consumes="application/json")
  ResponseEntity<?>  setCourse(@RequestBody Course course) {
	
	service.createNewCourse(course);
	
	   HttpHeaders responseHeaders = new HttpHeaders();
	   URI newPollUri = ServletUriComponentsBuilder
	   .fromCurrentContextPath()
	  .path("/courses/get/{id}")
	  .buildAndExpand(course.getId())
	  .toUri();
	   responseHeaders.setLocation(newPollUri);
	   return new ResponseEntity<>(responseHeaders, HttpStatus.OK);
  }
  
  
  
  @RequestMapping(value="/courses/update",method = RequestMethod.PUT,consumes="application/json")
  ResponseEntity<?>  updateCourse(@RequestBody Course course) {
	
	service.updateCourse(course);
	
	   HttpHeaders responseHeaders = new HttpHeaders();
	   URI newPollUri = ServletUriComponentsBuilder
	   .fromCurrentContextPath()
	  .path("/courses/get/{id}")
	  .buildAndExpand(course.getId())
	  .toUri();
	   responseHeaders.setLocation(newPollUri);
	   return new ResponseEntity<>(responseHeaders, HttpStatus.CREATED);
  }
  
  
  
  @RequestMapping(value="/courses/delete/{courseid}",method = RequestMethod.DELETE)
  ResponseEntity<?>  deleteCourse(@PathVariable("courseid") Long id){
	  //System.out.println(id);
	   service.deleteCourse(id);
	   return new ResponseEntity<>(HttpStatus.OK);
  }	
}
