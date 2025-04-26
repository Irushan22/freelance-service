package com.freelancer.freelancer.service.impl;

import com.freelancer.freelancer.dto.FreelancerDTO;
import com.freelancer.freelancer.entity.Freelancer;
import com.freelancer.freelancer.mapper.FreelancerMapper;
import com.freelancer.freelancer.repository.FreelancerRepository;
import com.freelancer.freelancer.service.FreelancerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreelanceServiceImpl implements FreelancerService {
    private final FreelancerRepository repository;

    public FreelanceServiceImpl(FreelancerRepository repository){
        this.repository = repository;
    }


    @Override
    public List<FreelancerDTO> getAllFreelancers() {
        return repository.findAll().stream()
                .map(FreelancerMapper::toDto)
                .toList();
    }

    @Override
    public FreelancerDTO createFreelancer(FreelancerDTO dto) {
        Freelancer entity = FreelancerMapper.toEntity(dto);
        Freelancer saved = repository.save(entity);
        return FreelancerMapper.toDto(saved);
    }

    @Override
    public FreelancerDTO updateFreelancer(FreelancerDTO dto) {
        Freelancer entity = FreelancerMapper.toEntity(dto);
        Freelancer updated = repository.save(entity);
        return FreelancerMapper.toDto(updated);
    }
}
