package com.example.PravinTechCompany.controller;

import com.example.PravinTechCompany.api.EmployeeApi;
import com.example.PravinTechCompany.model.EmployeeDto;
import com.example.PravinTechCompany.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/onboarding")
@RequiredArgsConstructor
public class EmployeeController implements EmployeeApi {

    private final EmployeeService employeeService;

    @Override
    public ResponseEntity<String> addEmployee(EmployeeDto employeeDto) {
        return employeeService.addEmployee(employeeDto);
    }

    @Override
    public ResponseEntity<List<EmployeeDto>> getAllEmployee() {
        return employeeService.getAllEmployee();
    }
}
