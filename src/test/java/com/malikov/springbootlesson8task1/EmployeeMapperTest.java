package com.malikov.springbootlesson8task1;

import com.malikov.springbootlesson8task1.emlployee.Employee;
import com.malikov.springbootlesson8task1.emlployee.EmployeeDTO;
import com.malikov.springbootlesson8task1.emlployee.EmployeeMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeMapperTest {

    @Test
    public void testEmployeeDTOToEmployeeMapping() {
        EmployeeDTO employeeDTO = new EmployeeDTO(1, "John Doe", "Engineering", 75000.00);

        Employee employee = EmployeeMapper.INSTANCE.toEntity(employeeDTO);

        assertEquals(employeeDTO.getEmployeeId(), employee.getId(), "Employee ID should match");
        assertEquals(employeeDTO.getEmployeeName(), employee.getName(), "Employee name should match");
        assertEquals(employeeDTO.getEmployeeDepartment(), employee.getDepartment(), "Employee department should match");
        assertEquals(employeeDTO.getEmployeeSalary(), employee.getSalary(), "Employee salary should match");
    }

    @Test
    public void testEmployeeToEmployeeDTOMapping() {
        Employee employee = new Employee(1, "Jane Doe", "Marketing", 65000.00);

        EmployeeDTO employeeDTO = EmployeeMapper.INSTANCE.toDTO(employee);

        assertEquals(employee.getId(), employeeDTO.getEmployeeId(), "EmployeeDTO ID should match");
        assertEquals(employee.getName(), employeeDTO.getEmployeeName(), "EmployeeDTO name should match");
        assertEquals(employee.getDepartment(), employeeDTO.getEmployeeDepartment(), "EmployeeDTO department should match");
        assertEquals(employee.getSalary(), employeeDTO.getEmployeeSalary(), "EmployeeDTO salary should match");
    }
}

