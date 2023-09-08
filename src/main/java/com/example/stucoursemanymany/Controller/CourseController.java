package com.example.stucoursemanymany.Controller;

import com.example.stucoursemanymany.dto.CourseDto;
import com.example.stucoursemanymany.entity.Course;
import com.example.stucoursemanymany.service.CourseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {



    @Autowired
    private CourseServiceImp courseService;
    @GetMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("{courseId}")
    public Course getCourseById(@PathVariable long courseId){
        return courseService.getCourseById(courseId);
    }

    @PostMapping
    public CourseDto addCourse(@RequestBody CourseDto courseDto){
        return courseService.addCourse(courseDto);
    }

    @PostMapping("{courseId}")
    public void updateCourseById(@PathVariable long courseId, @RequestBody CourseDto courseDto){
        courseService.updateCourseById(courseId, courseDto);
    }

    @DeleteMapping("{courseId}")
    public void deleteCourseById(@PathVariable long courseId){
        courseService.deleteCourseById(courseId);
    }
}
