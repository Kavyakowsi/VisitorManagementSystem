package com.example.visitormanagementsystem.controller;

import com.example.visitormanagementsystem.entity.Manager;
import com.example.visitormanagementsystem.entity.Security;
import com.example.visitormanagementsystem.service.SecurityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/security")
@RequiredArgsConstructor
public class SecurityController {

    private final SecurityService securityService;

    @GetMapping("/manager-decisions")
    public List<Manager> getManagerDecisions() {
        return securityService.getManagerDecisions();
    }
    @PostMapping
    public Security createSecurityRecord(@RequestBody Security security) {
        return securityService.createSecurityRecord(security);
    }
    @GetMapping
    public List<Security> getAllSecurityRecords() {
        return securityService.getAllSecurityRecords();
    }
}