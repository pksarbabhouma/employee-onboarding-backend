package com.pradip.demo.employee_onboarding_backend;

import com.pradip.demo.employee_onboarding_backend.props.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
