package com.lendismart.backendinterview;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class BackendInterviewApplication {


	public static void main(String[] args) {
		SpringApplication.run(BackendInterviewApplication.class, args);
	}

	/*@Bean
	CommandLineRunner init(SoapClient soapClient, WebClient.Builder webClientBuilder){
		return args -> {

			AddResponse addResponse = soapClient.getAddResponse(2, 2);
		};
	}*/

}