package com.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.Course;

@Service
public class CourseServiceImpl implements CourseServices {
	
	List<Course>list;
	public CourseServiceImpl() {
		list=new ArrayList();
		list.add(new Course(145,"java","Java Basics"));
		list.add(new Course(146,"Servlet","Servlet Basics"));
		list.add(new Course(147,"SpringBoot","SpringBoot Basics"));
		
		
	}
 
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	
	

}
