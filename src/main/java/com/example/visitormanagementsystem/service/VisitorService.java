package com.example.visitormanagementsystem.service;

import com.example.visitormanagementsystem.entity.Visitor;

import java.util.List;

public interface VisitorService {

    Visitor createVisitor(Visitor visitor);

    List<Visitor> getAllVisitors();

    Visitor getVisitorById(Long id);

    void deleteVisitor(Long id);
}