package com.priyanshi.LearningSpringBoot;

import com.priyanshi.LearningSpringBoot.Entity.UserExFieldInjection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearningSpringBootApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context=SpringApplication.run(LearningSpringBootApplication.class, args);
		context.close();

		/*
		for testing purpose
		UserExFieldInjection user=new UserExFieldInjection();
		user.process();*/
	}

}
