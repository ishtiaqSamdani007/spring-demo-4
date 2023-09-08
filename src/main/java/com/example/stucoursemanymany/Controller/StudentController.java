package com.example.stucoursemanymany.Controller;

import com.example.stucoursemanymany.dto.StudentDto;
import com.example.stucoursemanymany.entity.Student;
import com.example.stucoursemanymany.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentServiceImp studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("{studentId}")
    public Student getStudentById(@PathVariable long studentId){
        return studentService.getStudentById(studentId);
    }

    @PostMapping
    public StudentDto addStudent(@RequestBody StudentDto studentDto){
        return studentService.addStudent(studentDto);
    }

    @PatchMapping("{studentId}")
    public void updateStudentById(@PathVariable long studentId,@RequestBody StudentDto studentDto){
        studentService.updateStudentById(studentId, studentDto);
    }

    @DeleteMapping("{studentId}")
    public void deleteStudentById(@RequestBody long studentId){
        studentService.deleteStudentById(studentId);
    }
}
