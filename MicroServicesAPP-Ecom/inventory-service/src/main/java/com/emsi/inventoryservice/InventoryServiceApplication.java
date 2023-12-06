package com.emsi.inventoryservice;

import com.emsi.inventoryservice.entities.Product;
import com.emsi.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository) {
		return args -> {
			productRepository.saveAll(
					List.of(
							Product.builder().name("computer").price(1000).quantity(10).build(),
							Product.builder().name("printer").price(200).quantity(10).build(),
							Product.builder().name("phone").price(100).quantity(10).build(),
							Product.builder().name("camera").price(800).quantity(10).build()

					));
			productRepository.findAll().forEach(System.out::println);
		};
	}



}
