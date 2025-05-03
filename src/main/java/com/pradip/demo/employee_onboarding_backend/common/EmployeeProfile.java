package com.pradip.demo.employee_onboarding_backend.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class EmployeeProfile {
    private long employeeId;
    private String emailId;
    private String firstName;
    private String lastName;
    private String managerId;
    private String projectId;
    private String highestQualification;
    private String[] skills;
}
