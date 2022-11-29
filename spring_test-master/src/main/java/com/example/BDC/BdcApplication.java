package com.example.BDC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BdcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BdcApplication.class, args);
	}

}
