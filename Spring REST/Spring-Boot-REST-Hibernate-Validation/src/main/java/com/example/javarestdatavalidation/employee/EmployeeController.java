package com.example.javarestdatavalidation.employee;

import com.example.javarestdatavalidation.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(@Qualifier("employeeServiceJpaImp")EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    @PostMapping("/employees")
    Employee addEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeService.save(employeeDto);
    }
}
