package com.example.stucoursemanymany.dto;

import com.example.stucoursemanymany.entity.Course;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDto {

    private long id;
    private String name;

    private List<Course> courses;
}
