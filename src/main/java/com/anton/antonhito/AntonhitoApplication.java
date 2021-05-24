package com.anton.antonhito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class AntonhitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntonhitoApplication.class, args);
	}

}
