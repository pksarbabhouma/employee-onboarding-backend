package com.pradip.demo.employee_onboarding_backend.hr;

import com.pradip.demo.employee_onboarding_backend.common.Employee;
import com.pradip.demo.employee_onboarding_backend.common.EmployeeProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private static List<Employee> employees = new ArrayList<>();

    static {
        Employee emp1 = Employee.builder()
                .employeeId(1)
                .emailId("abc.def@xyz.com")
                .firstName("abc")
                .lastName("def")
                .build();

        Employee emp2 = Employee.builder()
                .employeeId(2)
                .emailId("jkl.mno@xyz.com")
                .firstName("jkl")
                .lastName("mno")
                .build();
        employees.add(emp1);
        employees.add(emp2);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployee(long employeeId) {
        return employees.stream()
                .filter(employee -> employee.getEmployeeId() == employeeId)
                .findFirst()
                .get();
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }
}
