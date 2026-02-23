package com.example.PravinTechCompany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employeetable")
@Entity
public class EmployeeEntity {
    @Id
    private String id;
    private String name;
    private String role;
    private int age;
    private double salary;
}
