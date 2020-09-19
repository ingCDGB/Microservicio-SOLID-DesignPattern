package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Slf4j
@SpringBootApplication
//@EnableAspectJAutoProxy
public class DemoApplication {

	@Bean
	public String exampleBean() {
		return "";
	}

	public static void main(String[] args) {

		applicationContext = SpringApplication.run(DemoApplication.class, args);

		log.info(" ----- APPLICATION IS RUNNING ----- ");
		checkBeansPresence("exampleBean","exampleAspect","ExampleAspect","Controller");
	}
	private static ApplicationContext applicationContext;

	private static void checkBeansPresence(String... beans) {
		for (String beanName : beans) {
			log.info("Is " + beanName + " in ApplicationContext: " +
					applicationContext.containsBean(beanName));
		}
	}

}
