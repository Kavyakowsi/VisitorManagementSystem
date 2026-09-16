package com.example.visitormanagementsystem.service;

import com.example.visitormanagementsystem.entity.*;
import com.example.visitormanagementsystem.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {

    private final ManagerRepository managerRepository;
    private final VisitorRepository visitorRepository;

    @Override
    public List<Visitor> getVisitors() {
        return visitorRepository.findAll();
    }

    @Override
    public Manager createDecision(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public Manager getDecisionById(Long id) {
        return managerRepository.findById(id).orElse(null);
    }
}