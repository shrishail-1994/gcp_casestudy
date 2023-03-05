package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demo")
//@EnableJpaRepositories
//@EntityScan("com.example.demo.*")
public class GcpCasestudy1Application {

	public static void main(String[] args) {
		SpringApplication.run(GcpCasestudy1Application.class, args);
	}
}
