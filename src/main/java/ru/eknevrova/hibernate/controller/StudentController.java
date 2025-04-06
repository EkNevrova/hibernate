package ru.eknevrova.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.eknevrova.hibernate.model.Student;
import ru.eknevrova.hibernate.service.StudentService;
import ru.eknevrova.hibernate.service.StudentServiceImpl;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentServiceImpl studentServiceImpl;

    @GetMapping("/students")
    public List<Student> getStudentsByName(@RequestParam String name) {
        return studentServiceImpl.getStudentsByName(name);
    }
}
