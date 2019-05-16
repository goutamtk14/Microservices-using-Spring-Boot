package com.mobile.mobilecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MobileCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileCatalogServiceApplication.class, args);
	}

//	@Bean
//	@LoadBalanced
//	public WebClient.Builder getWebClient(){
//		return WebClient.builder();
//	}
//	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
