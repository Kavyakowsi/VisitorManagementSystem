package com.example.visitormanagementsystem.service;

import com.example.visitormanagementsystem.entity.*;
import com.example.visitormanagementsystem.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SecurityServiceImpl implements SecurityService {

    private final ManagerRepository managerRepository;
    private final SecurityRepository securityRepository;

    @Override
    public List<Manager> getManagerDecisions() {
        return managerRepository.findAll();
    }

    @Override
    public Security createSecurityRecord(Security security) {
        return securityRepository.save(security);
    }

    @Override
    public List<Security> getAllSecurityRecords() {
        return securityRepository.findAll();
    }
}