package com.pradip.demo.employee_onboarding_backend;

import com.pradip.demo.employee_onboarding_backend.props.AppProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class ApplicationTests {

	@Autowired
	AppProperties appProperties;

	@Test
	void checkPropertiesFileLoaded() {
		System.out.println("*** Developed by - " + appProperties.getDevelopedBy() + " on " + appProperties.getDevelopedOn());
	}

}
