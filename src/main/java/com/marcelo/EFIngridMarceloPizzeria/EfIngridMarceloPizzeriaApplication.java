package com.marcelo.EFIngridMarceloPizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EfIngridMarceloPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfIngridMarceloPizzeriaApplication.class, args);
	}

}
