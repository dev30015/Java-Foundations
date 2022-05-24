package com.example.javarestdatavalidation.employee;

import com.example.javarestdatavalidation.dto.EmployeeDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceJpaImp implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceJpaImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee save(EmployeeDto employeeDto) {
        Employee newEmployee = new Employee();
        BeanUtils.copyProperties(employeeDto,newEmployee);
        System.out.println("New employee is "+newEmployee);
        return this.employeeRepository.save(newEmployee);
    }
}
