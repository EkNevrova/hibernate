package ru.eknevrova.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.eknevrova.hibernate.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("FROM Student s WHERE s.name = :name")
    List<Student> findStudentsByName(@Param("name") String name);
}
