package com.example.visitormanagementsystem.service;

import com.example.visitormanagementsystem.entity.Visitor;
import com.example.visitormanagementsystem.repository.VisitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitorServiceImpl implements VisitorService {

    private final VisitorRepository visitorRepository;

    @Override
    public Visitor createVisitor(Visitor visitor) {
        return visitorRepository.save(visitor);
    }

    @Override
    public List<Visitor> getAllVisitors() {
        return visitorRepository.findAll();
    }

    @Override
    public Visitor getVisitorById(Long id) {
        return visitorRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteVisitor(Long id) {
        visitorRepository.deleteById(id);
    }
}