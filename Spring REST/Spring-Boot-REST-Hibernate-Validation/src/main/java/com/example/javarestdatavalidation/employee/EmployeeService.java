package com.example.javarestdatavalidation.employee;


import com.example.javarestdatavalidation.dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> findAll();
    Employee save(EmployeeDto employeeDto);
}
