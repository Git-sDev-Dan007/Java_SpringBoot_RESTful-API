package com.stackroute.customerapp;
import org.springframework.boot.SpringApplication;

public class CustomerappApplication {

	//we no need to give the SPringBootApplication annotation in the same class of main
	public static void main(String[] args) {
		SpringApplication.run(CustomerSpringbootApp.class, args);//we can just past the class in which we declared SpringBootApplication
	}
}
