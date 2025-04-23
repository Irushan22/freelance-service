package com.freelancer.freelancer.mapper;

import com.freelancer.freelancer.dto.FreelancerDTO;
import com.freelancer.freelancer.entity.Freelancer;


public class FreelancerMapper {
    public static FreelancerDTO toDto(Freelancer freelancer){
        return new FreelancerDTO(
                freelancer.getId(),
                freelancer.getFullName(),
                freelancer.getEmail(),
                freelancer.getSkill(),
                freelancer.getHourlyRate()
        );
    }

    public static Freelancer toEntity(FreelancerDTO dto){
        return Freelancer.builder()
                .id(dto.id())
                .fullName(dto.fullName())
                .email(dto.email())
                .skill(dto.skill())
                .hourlyRate(dto.hourlyRate())
                .build();
    }
}
