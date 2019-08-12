package com.example.demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Product;

@Configuration
public class AppConfig {
	
	@Bean
	public Product laptop() {
		return new Product(101,"Dell Laptop","images/dell.jpg",35000.00D,4.2);
	}
	
	@Bean
	public Product mobilePhone() {
		return new Product(102,"Samsung","images/samsung.jpg",15000.00D,3.8);
	}
	
	@Bean
	public Product printer() {
		return new Product(103,"HP Printer","images/printer_hp.jpg",25000.00D,4.3);
	}
}
