package com.malikov.springbootlesson8task1.emlployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Transactional(readOnly = true)
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .map(employeeMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public EmployeeDTO getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.map(employeeMapper::toDTO)
                .orElse(null); // or throw an exception
    }

    @Transactional
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeMapper.toEntity(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        return employeeMapper.toDTO(savedEmployee);
    }

    @Transactional
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
