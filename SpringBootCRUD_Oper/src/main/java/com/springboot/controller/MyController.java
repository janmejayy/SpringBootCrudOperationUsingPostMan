package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Course;
import com.springboot.services.CourseServices;

@RestController
public class MyController {
	@Autowired
	private CourseServices courseServices;
      
	@GetMapping("/welcome")
	public String Courses() {
		return "Welcome to courses";
	}
	
	@GetMapping("/courses")
	public List<Course>getCourses(){
		return this.courseServices.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")	
	public Course getCourse(@PathVariable String courseId) {
		return this.courseServices.getCourse(Long.parseLong(courseId));
	
		}
	@PostMapping("/courses")
	public Course addCourses(@RequestBody Course course) {
		return this.courseServices.addCourse(course);
		
	}
	
	
}