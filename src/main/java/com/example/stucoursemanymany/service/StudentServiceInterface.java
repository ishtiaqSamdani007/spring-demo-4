package com.example.stucoursemanymany.service;

import com.example.stucoursemanymany.dto.StudentDto;
import com.example.stucoursemanymany.entity.Student;

import java.util.List;

public interface StudentServiceInterface {
    public StudentDto addStudent(StudentDto studentDto);

    public List<Student> getAllStudents();
    public Student getStudentById(long id);

    public void updateStudentById(long id, StudentDto studentDto);

    public void deleteStudentById(long id);


}
