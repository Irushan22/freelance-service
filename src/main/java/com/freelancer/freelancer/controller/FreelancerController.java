package com.freelancer.freelancer.controller;

import com.freelancer.freelancer.dto.FreelancerDTO;
import com.freelancer.freelancer.service.FreelancerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class FreelancerController {

    private final FreelancerService service;

    public FreelancerController(FreelancerService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FreelancerDTO>> getAlll(){
        return ResponseEntity.ok(service.getAllFreelancers());
    }

    @PostMapping
    public ResponseEntity<FreelancerDTO> create(@RequestBody FreelancerDTO dto){
        return ResponseEntity.ok(service.createFreelancer(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FreelancerDTO> update(@PathVariable Long id, @RequestBody FreelancerDTO dto){
        return ResponseEntity.ok(service.updateFreelancer(id,dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FreelancerDTO> getById(@PathVariable Long id){
        return ResponseEntity.ok(service.findByFreelancerId(id));
    }
}
