package ru.eknevrova.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.eknevrova.hibernate.model.Student;
import ru.eknevrova.hibernate.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudentsByName(String name) {
        return studentRepository.findStudentsByName(name);
    }

}
