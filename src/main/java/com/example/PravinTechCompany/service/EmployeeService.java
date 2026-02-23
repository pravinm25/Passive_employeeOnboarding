package com.example.PravinTechCompany.service;

import com.example.PravinTechCompany.entity.EmployeeEntity;
import com.example.PravinTechCompany.mapper.EmployeeMapper;
import com.example.PravinTechCompany.model.EmployeeDto;
import com.example.PravinTechCompany.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public ResponseEntity<String> addEmployee(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = employeeMapper.dtoToEntity(employeeDto);
        employeeRepository.save(employeeEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee created successfully");
    }

    public ResponseEntity<List<EmployeeDto>> getAllEmployee() {
        List<EmployeeEntity> employeeEntityList = employeeRepository.findAll();
        List<EmployeeDto> employeeDtoList = employeeEntityList.stream()
                .map(employeeMapper::entityToDto)
                .toList();
        return ResponseEntity.ok(employeeDtoList);
    }
}
