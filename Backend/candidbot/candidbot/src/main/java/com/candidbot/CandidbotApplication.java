package com.candidbot;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CandidbotApplication {

	Log LOGGER = LogFactory.getLog(CandidbotApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CandidbotApplication.class, args);
	}

}
