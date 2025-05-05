package com.freelancer.freelancer.service;

import com.freelancer.freelancer.dto.FreelancerDTO;

import java.util.List;

public interface FreelancerService {
    List<FreelancerDTO> getAllFreelancers();
    FreelancerDTO createFreelancer(FreelancerDTO dto);
    FreelancerDTO updateFreelancer(Long id, FreelancerDTO dto);
    FreelancerDTO findByFreelancerId(Long id);
}
