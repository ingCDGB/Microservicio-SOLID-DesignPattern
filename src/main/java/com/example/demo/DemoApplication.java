package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DemoApplication {

	/*private static final org.slf4j.Logger log =
			org.slf4j.LoggerFactory.getLogger(DemoApplication.class);*/
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		log.info(" ----- APPLICATION IS RUNNING ----- ");
	}

}
