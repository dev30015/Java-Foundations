package com.example.javarestdatavalidation.employee;

import com.example.javarestdatavalidation.dto.EmployeeDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//@Service
public class EmployeeServiceMockedImp implements EmployeeService{
    //mocking the employeeService
    private List<Employee> employeeMockedDb;

    public EmployeeServiceMockedImp() {
        this.employeeMockedDb = new LinkedList<>();
        this.employeeMockedDb.add(new Employee(1,"admin","admin@msn.com"));
        this.employeeMockedDb.add(new Employee(2,"guest","guest@msn.com"));
        this.employeeMockedDb.add(new Employee(3,"user1","user1@msn.com"));
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeMockedDb;
    }

    @Override
    public Employee save(EmployeeDto employeeDto) {
        Employee newEmployee = new Employee();
        BeanUtils.copyProperties(employeeDto,newEmployee);

        if (!this.employeeMockedDb.contains(newEmployee)) {
            Long nextId = Long.valueOf(employeeMockedDb.size()+1);
            newEmployee.setId(nextId);
            this.employeeMockedDb.add(newEmployee);
            return newEmployee;
        }

        return null;
    }
}
