package com.example.visitormanagementsystem.controller;

import com.example.visitormanagementsystem.entity.Manager;
import com.example.visitormanagementsystem.entity.Visitor;
import com.example.visitormanagementsystem.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/managers")
@RequiredArgsConstructor
public class ManagerController {

    private final ManagerService managerService;

    @GetMapping("/visitors")
    public List<Visitor> getVisitors() {
        return managerService.getVisitors();
    }
    @PostMapping
    public Manager createDecision(@RequestBody Manager manager) {
        return managerService.createDecision(manager);
    }

    @GetMapping("/{id}")
    public Manager getDecisionById(@PathVariable Long id) {
        return managerService.getDecisionById(id);
    }
}