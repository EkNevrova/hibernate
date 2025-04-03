package ru.eknevrova.hibernate.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column (name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column (name = "email", unique = true, nullable = false, length = 100)
    private String email;

    @Column (name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column (name = "last_modified_at")
    private LocalDateTime lastModifiedAt;

    @ManyToMany
}
