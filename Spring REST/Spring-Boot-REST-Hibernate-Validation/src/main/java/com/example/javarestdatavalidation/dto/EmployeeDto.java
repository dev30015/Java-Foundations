package com.example.javarestdatavalidation.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDto {
    private String username;
    private String emailAddress;
}
