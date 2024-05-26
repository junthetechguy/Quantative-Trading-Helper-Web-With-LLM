package com.capstone.quantativetradinghelperwebwithllm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class QuantativetradinghelperwebwithllmApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuantativetradinghelperwebwithllmApplication.class, args);
	}

}
