package com.example.visitormanagementsystem.service;

import com.example.visitormanagementsystem.entity.*;

import java.util.List;

public interface ManagerService {

    List<Visitor> getVisitors();

    Manager createDecision(Manager manager);

    Manager getDecisionById(Long id);
}