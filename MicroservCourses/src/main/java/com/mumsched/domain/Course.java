package com.mumsched.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String name; 
	 
	public String getPrereqCourse() {
		return prereqCourse;
	}

	public void setPrereqCourse(String prereqCourse) {
		this.prereqCourse = prereqCourse;
	}

	public String getEntryBlock() {
		return EntryBlock;
	}

	public void setEntryBlock(String entryBlock) {
		EntryBlock = entryBlock;
	}

	@Column
	private String prereqCourse;

	@Column
	private String EntryBlock;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
}
