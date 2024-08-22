package com.user.batch.employee.controller;

import com.user.batch.employee.service.EmployeeService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeService employeeService;

    @PostMapping
    @Async
    public void maintainEmployees() {
        employeeService.maintainEmployees();
    }
}
