package com.academics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.academics")
public class AcademicOperationsPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademicOperationsPlatformApplication.class, args);
	}

}
