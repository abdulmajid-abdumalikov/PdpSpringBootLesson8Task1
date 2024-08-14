package com.malikov.springbootlesson8task1.emlployee;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(source = "employeeId", target = "id")
    @Mapping(source = "employeeName", target = "name")
    @Mapping(source = "employeeDepartment", target = "department")
    @Mapping(source = "employeeSalary", target = "salary")
    Employee toEntity(EmployeeDTO employeeDTO);

    @Mapping(source = "id", target = "employeeId")
    @Mapping(source = "name", target = "employeeName")
    @Mapping(source = "department", target = "employeeDepartment")
    @Mapping(source = "salary", target = "employeeSalary")
    EmployeeDTO toDTO(Employee employee);
}

