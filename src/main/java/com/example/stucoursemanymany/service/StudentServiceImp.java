package com.example.stucoursemanymany.service;

import com.example.stucoursemanymany.dao.StudentRepo;
import com.example.stucoursemanymany.dto.StudentDto;
import com.example.stucoursemanymany.entity.Student;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentServiceImp implements StudentServiceInterface {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public StudentDto addStudent(StudentDto studentDto) {
        Student student = modelMapper.map(studentDto, Student.class);
        studentRepo.save(student);
        return studentDto;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public void updateStudentById(long id, StudentDto studentDto) {
        Student student = studentRepo.findById(id).get();
        student.setName(studentDto.getName());
    }

    @Override
    public void deleteStudentById(long id) {
        studentRepo.deleteById(id);
    }
}
