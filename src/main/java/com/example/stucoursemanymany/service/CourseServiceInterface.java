package com.example.stucoursemanymany.service;

import com.example.stucoursemanymany.dto.CourseDto;
import com.example.stucoursemanymany.entity.Course;

import java.util.List;

public interface CourseServiceInterface {
    public CourseDto addCourse(CourseDto courseDto);
    public Course getCourseById(long id);

    public List<Course> getAllCourses();
    public void updateCourseById(long id, CourseDto courseDto);

    public void deleteCourseById(long id);

//    public void addStudentToCourse(long courseId, long studentId);
}
