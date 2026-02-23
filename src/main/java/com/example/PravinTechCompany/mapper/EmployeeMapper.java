package com.example.PravinTechCompany.mapper;

import com.example.PravinTechCompany.entity.EmployeeEntity;
import com.example.PravinTechCompany.model.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmployeeMapper {

    private final ModelMapper modelMapper;

    public EmployeeEntity dtoToEntity(EmployeeDto employeeDto){
        return modelMapper.map(employeeDto, EmployeeEntity.class);
    }

    public EmployeeDto entityToDto(EmployeeEntity employeeEntity){
        return modelMapper.map(employeeEntity, EmployeeDto.class);
    }
}
