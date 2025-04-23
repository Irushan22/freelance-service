package com.freelancer.freelancer.dto;

public record FreelancerDTO(
        Long id,
        String fullName,
        String email,
        String skill,
        Double hourlyRate
) {}
