// Chapter .7
package com.example.petshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableAspectJAutoProxy

public class PetshopApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(PetshopApplication.class, args);
	}
}

