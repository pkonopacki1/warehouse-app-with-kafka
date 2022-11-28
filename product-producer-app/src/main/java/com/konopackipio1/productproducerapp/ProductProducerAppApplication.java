package com.konopackipio1.productproducerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProductProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductProducerAppApplication.class, args);
	}

}
