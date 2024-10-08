package com.example.lab3_20190803.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Integer id;

    @Column(name = "first_name", length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 25)
    private String lastName;

    @Column(name = "email", nullable = false, length = 25)
    private String email;

    @ColumnDefault("'$2a$10$nFKnvQ4h.jKhMyEN6LnEBOUTONuXCdJvzIKzYz.PVLpReP5G9NE96'")
    @Column(name = "password", length = 65)
    private String password;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @ColumnDefault("'1000-01-01 00:00:00'")
    @Column(name = "hire_date", nullable = false)
    private Instant hireDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

    @Column(name = "salary", precision = 8, scale = 2)
    private BigDecimal salary;

    @Column(name = "commission_pct", precision = 2, scale = 2)
    private BigDecimal commissionPct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Employee manager;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @ColumnDefault("0")
    @Column(name = "enabled")
    private Integer enabled;

}