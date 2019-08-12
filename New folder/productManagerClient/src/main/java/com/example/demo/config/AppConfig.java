package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.example.demo.clients.ProductClient;
import com.example.demo.model.Product;

@Configuration
public class AppConfig {

	@Bean
	public ProductClient client() {
		return new ProductClient();
	}
	@Bean
	public Product product() {
		return new Product(103,"Printer","images/printer.jpg",40000,3.4);
	}
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
