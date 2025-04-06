package ru.eknevrova.hibernate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.eknevrova.hibernate.model.Course;
import ru.eknevrova.hibernate.model.Student;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GradeDto {
    private Long id;
    private Student student;
    private Course course;
}
