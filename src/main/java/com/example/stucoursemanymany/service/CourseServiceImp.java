package com.example.stucoursemanymany.service;

import com.example.stucoursemanymany.dao.CourseRepo;
import com.example.stucoursemanymany.dto.CourseDto;
import com.example.stucoursemanymany.entity.Course;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CourseServiceImp implements CourseServiceInterface {

    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public CourseDto addCourse(CourseDto courseDto) {
        Course course = modelMapper.map(courseDto, Course.class);
        System.out.println(course);
        courseRepo.save(course);
        return courseDto;
    }

    @Override
    public Course getCourseById(long id) {
        return courseRepo.findById(id).get();
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public void updateCourseById(long id,CourseDto courseDto) {
        Course course = courseRepo.findById(id).get();
        course.setName(courseDto.getName());

    }

    @Override
    public void deleteCourseById(long id) {
        courseRepo.deleteById(id);
    }

//    @Override
//    public void addStudentToCourse(long courseId, long studentId) {
//        Course course = courseRepo.findById(courseId).get();
//        course.
//    }
}
