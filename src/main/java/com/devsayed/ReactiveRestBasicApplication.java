package com.devsayed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ReactiveRestBasicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ReactiveRestBasicApplication.class, args);

		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		System.out.println(">> message = " + greetingClient.getMessage().block());
	}

}
