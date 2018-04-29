package com.deewlabs.aquasplash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.deewlabs")
public class AquasplashApplication {

	private static Logger  logger=LoggerFactory.getLogger(AquasplashApplication.class);
	public static void main(String[] args) {
	
		SpringApplication.run(AquasplashApplication.class, args);
		logger.info("Started");
	}
}
