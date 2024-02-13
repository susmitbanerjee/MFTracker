package com.example.MFTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MfTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MfTrackerApplication.class, args);
	}

}
