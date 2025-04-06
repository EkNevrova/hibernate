package ru.eknevrova.hibernate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.eknevrova.hibernate.model.Student;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CourseDTO {
    private Long id;
    private String title;
    private String description;
    private Integer creditHours;
    private List<Student> students = new ArrayList<>();
}
