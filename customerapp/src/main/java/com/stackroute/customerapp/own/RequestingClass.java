package com.stackroute.customerapp.own;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestingClass {

	@GetMapping("Applicant/login")
	public ResponseEntity showlogin() {
		return new ResponseEntity("Hello There!",HttpStatus.OK) ;
	}
	
	@GetMapping("Applicant/loginName")
	public ResponseEntity changeName(@RequestParam("yourname")String name) {
		return new ResponseEntity("Have a nice day " + name.toUpperCase(),HttpStatus.OK);
	}
	
	
	
}
