package com.freelancer.freelancer.repository;

import com.freelancer.freelancer.entity.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreelancerRepository extends JpaRepository<Freelancer, Long> {
}
