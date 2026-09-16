package com.example.visitormanagementsystem.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "security_records")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long visitorId;
    private String securityName;
    private String securityId;
    private String checkInTime;
    private String checkOutTime;
    private String remarks;
    private String createdAt;
}