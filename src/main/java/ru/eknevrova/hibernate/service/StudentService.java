package ru.eknevrova.hibernate.service;

import ru.eknevrova.hibernate.dto.StudentDto;

public interface StudentService {
    StudentDto getStudentById(Long id);
}
