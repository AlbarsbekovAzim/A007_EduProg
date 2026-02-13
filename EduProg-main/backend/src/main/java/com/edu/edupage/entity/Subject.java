package com.edu.edupage.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "subjects")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    private String shortName; // Short name for UI (e.g., "Math" for "Mathematics")

    @Column(nullable = false)
    private Integer hoursPerWeek;
}
