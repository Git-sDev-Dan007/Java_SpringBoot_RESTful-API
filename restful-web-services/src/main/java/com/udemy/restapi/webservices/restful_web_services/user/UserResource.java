package com.udemy.restapi.webservices.restful_web_services.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
   private UserDaoService service;

public UserResource(UserDaoService service) {
	//super();
	this.service = service;
}
   //GET /users
@GetMapping("users/")
public List<User> retrieveAllUsers(){
	return service.findAll();
}
   
//GET specific users
@GetMapping("/users/{id}")
public User retrieveUser(@PathVariable int id){
	return  service.findOne(id);
}

}
