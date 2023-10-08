package com.myspring.s1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private Course course;
	private Subjects subjects;
	
	public Course getCourse() {
		return course;
	}

	@Autowired
	public void setCourse(Course course) {
		System.out.println("setter injection with course called");
		this.course = course;
	}
	
	public Subjects getSubjects() {
		return subjects;
	}

	@Autowired
	public void setSubjects(Subjects subjects) {
		System.out.println("setter injection with subjects called");
		this.subjects = subjects;
	}

	public Student() {
		System.out.println("student constructor with out arguments");
	}
	
	public Student(Course course) {
		System.out.println("student constructor with course=");
		this.course = course;
	}
	
	public Student(Course course, Subjects subjects) {
		System.out.println("student constructor with course and subjects");
		this.course = course;
		this.subjects = subjects;
	}
	
	public void studentDetils() {
		System.out.println("student details");
	}

	
}
