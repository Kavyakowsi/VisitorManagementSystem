package com.example.visitormanagementsystem.service;

import com.example.visitormanagementsystem.entity.*;

import java.util.List;

public interface SecurityService {

    List<Manager> getManagerDecisions();

    Security createSecurityRecord(Security security);

    List<Security> getAllSecurityRecords();
}