package com.freelancer.freelancer.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "freelancers")
@Data // Generates getters like getId()
@NoArgsConstructor
@AllArgsConstructor
@Builder // Enables .builder() method
public class Freelancer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String skill;
    private Double hourlyRate;
}
