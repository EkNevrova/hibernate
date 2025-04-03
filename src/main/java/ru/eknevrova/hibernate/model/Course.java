package ru.eknevrova.hibernate.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column (name = "description")
    private String description;

    @Column (name = "credit_hours", nullable = false)
    private Integer creditHours;


}
