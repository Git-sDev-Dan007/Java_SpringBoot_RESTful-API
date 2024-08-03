package com.stackroute.customerapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("customer/view")
	//call back method
	public ResponseEntity showview()
	{
		return new ResponseEntity("Hi Welcome ",HttpStatus.OK);
	}

	@GetMapping("customer/viewByName")
	public ResponseEntity changeName(@RequestParam("myname") String name) {
		
		return  new ResponseEntity("Gooday " + name.toUpperCase() , HttpStatus.OK);
	}
	
}
	