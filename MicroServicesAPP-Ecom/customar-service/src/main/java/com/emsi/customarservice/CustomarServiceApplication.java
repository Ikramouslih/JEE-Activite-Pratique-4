package com.emsi.customarservice;

import com.emsi.customarservice.entities.Customer;
import com.emsi.customarservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomarServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start( CustomerRepository customerRepository ) {
		return args -> {

			customerRepository.saveAll(


					List.of(
							Customer.builder().name ("Hassan").email("radi@gmail.com").build(),
							Customer.builder().name ("ali").email("ali@gmail.com").build(),
							Customer.builder().name ("mohamed").email("med@gmail.com").build(),
							Customer.builder().name ("youssef").email("youssef@gmail.com").build()


					));

			customerRepository.findAll().forEach(System.out::println);

		};
	}

}
