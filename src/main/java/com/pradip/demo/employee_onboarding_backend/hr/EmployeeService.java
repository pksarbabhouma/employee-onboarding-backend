package com.pradip.demo.employee_onboarding_backend.hr;

import com.pradip.demo.employee_onboarding_backend.common.Employee;
import com.pradip.demo.employee_onboarding_backend.common.EmployeeProfile;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public List<EmployeeProfile> fetchAllEmployees() {
        return employeeRepository.getEmployees().stream()
                .map(employee -> EmployeeProfile.builder()
                        .employeeId(employee.getEmployeeId())
                        .emailId(employee.getEmailId())
                        .firstName(employee.getFirstName())
                        .lastName(employee.getLastName())
                        .build())
                .collect(Collectors.toList());
    }

    public EmployeeProfile fetchEmployee(Long employeeId) {
        Employee employee = employeeRepository.getEmployee(employeeId);
        return EmployeeProfile.builder()
                .employeeId(employee.getEmployeeId())
                .emailId(employee.getEmailId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .build();
    }

    public EmployeeProfile registerNewEmployee(Employee employee) {
        Employee newEmployee = employeeRepository.addEmployee(employee);
        return EmployeeProfile.builder()
                .employeeId(newEmployee.getEmployeeId())
                .emailId(newEmployee.getEmailId())
                .firstName(newEmployee.getFirstName())
                .lastName(newEmployee.getLastName())
                .build();
    }

}
