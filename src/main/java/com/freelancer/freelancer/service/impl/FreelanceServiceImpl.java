package com.freelancer.freelancer.service.impl;

import com.freelancer.freelancer.dto.FreelancerDTO;
import com.freelancer.freelancer.entity.Freelancer;
import com.freelancer.freelancer.mapper.FreelancerMapper;
import com.freelancer.freelancer.repository.FreelancerRepository;
import com.freelancer.freelancer.service.FreelancerService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
    public FreelancerDTO updateFreelancer(Long id, FreelancerDTO dto) {
        Freelancer existing = repository.findById(id).
                orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Freelancer not found with id:" +id));

        existing.setFullName(dto.fullName());
        existing.setEmail(dto.email());
        existing.setSkill(dto.skill());
        existing.setHourlyRate(dto.hourlyRate());

        Freelancer updated = repository.save(existing);
        return FreelancerMapper.toDto(updated);
    }

    @Override
    public FreelancerDTO findByFreelancerId(Long id) {
        Freelancer freelancer = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Freelancer not found with id: "+id));
        return FreelancerMapper.toDto(freelancer);
    }


}
