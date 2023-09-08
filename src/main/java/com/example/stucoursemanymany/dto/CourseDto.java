package com.example.stucoursemanymany.dto;

import com.example.stucoursemanymany.entity.Student;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseDto {
    private long id;
    private String name;
    private List<Student> students;
}
