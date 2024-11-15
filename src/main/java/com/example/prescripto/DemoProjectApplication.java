package com.example.prescripto;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.prescripto.repository.PatientRepository;

@SpringBootApplication
@EnableJpaRepositories("com.example.prescripto.repository")
public class DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}
	
	

}
