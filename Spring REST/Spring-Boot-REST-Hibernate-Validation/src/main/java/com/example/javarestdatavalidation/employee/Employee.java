package com.example.javarestdatavalidation.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employees")
public class Employee {

    @Id
    @NotNull
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @NotEmpty(message = "Username not be empty")
    @Length(min=3, max=20,message="Username must be in between 3-20 characters long")
    @Column(name="username")
    private String username;

    @NotEmpty(message = "Email must not be empty")
    @Email(message="Must be a valid email address")
    @Length(min=3, max=20,message="Email address must be in between 3-20 characters long")
    @Column(name="email")
    private String emailAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(username, employee.username) && Objects.equals(emailAddress, employee.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, emailAddress);
    }
}
