package com.example.demo;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		ProductService service = new ProductService();
		List<Product> products = service.getAllProduct();
        
        // enhanced for loop
        for(Product prod : products){
            System.out.println(prod);
        }
        System.out.println("============================================================");
	}

}
