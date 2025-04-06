package ru.eknevrova.hibernate.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn (name = "course_id", nullable = false)
    private Course course;


}
