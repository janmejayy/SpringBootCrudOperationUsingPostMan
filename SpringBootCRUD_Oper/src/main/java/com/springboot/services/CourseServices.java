package com.springboot.services;

import java.util.List;

import com.springboot.entity.Course;

public interface CourseServices {
	public List<Course>getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	
}
