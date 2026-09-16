package com.example.visitormanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "manager_approvals")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long visitorId;
    private String decision;
    private String checkInTime;
    private String remarks;
}