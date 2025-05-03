package com.pradip.demo.employee_onboarding_backend.props;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app.props")
@Getter @Setter
@Validated
public class AppProperties {
    @NotEmpty
    private String developedBy;

    @NotEmpty
    private String developedOn;
}
