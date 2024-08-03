package com.stackroute.customerapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerSpringbootApp {

	public CustomerSpringbootApp() {  //the constructor is automatically invoked ,when the class is used on 
		System.out.println("Hey Im Dan"); //the SpringApplication.run() method
	}
}
