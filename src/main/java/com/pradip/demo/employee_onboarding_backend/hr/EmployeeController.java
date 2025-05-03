package com.pradip.demo.employee_onboarding_backend.hr;

import com.pradip.demo.employee_onboarding_backend.common.Employee;
import com.pradip.demo.employee_onboarding_backend.common.EmployeeProfile;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping
    public List<EmployeeProfile> fetchAllEmployees() {
        return employeeService.fetchAllEmployees();
    }

    @GetMapping("/{employeeId}")
    public EmployeeProfile fetchEmployee(@PathVariable long employeeId) {
        return employeeService.fetchEmployee(employeeId);
    }

    @PostMapping
    public EmployeeProfile registerNewEmployee(@RequestBody Employee employee) {
        return employeeService.registerNewEmployee(employee);
    }


}
