package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.clients.ProductClient;
import com.example.demo.model.Product;

@SpringBootApplication
public class ProductManagerClientApplication {

	@Autowired
	Product product;
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(ProductManagerClientApplication.class, args);
		
		ProductClient client = ctx.getBean(ProductClient.class);
		
		Product product = ctx.getBean(Product.class);
		client.getAll();
		
		client.addProduct(product);
		
	}

}
