package com.envite.bpmmeetsai;

import io.camunda.zeebe.spring.client.annotation.Deployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Deployment(resources = "classpath:ticket_process.bpmn")
public class BpmMeetsAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BpmMeetsAiApplication.class, args);
	}
}
