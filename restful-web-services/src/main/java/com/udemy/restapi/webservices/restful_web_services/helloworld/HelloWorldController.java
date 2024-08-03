package com.udemy.restapi.webservices.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Hello world REST API
//Rest API
@RestController
public class HelloWorldController {

	//@RequestMapping(method = RequestMethod.GET,path = "/helloworld")
	//we shall use specific requestmapping methods also,
//	@GetMapping(path = "/helloworld")
//	public String helloworld() {
//		return "Hello World";
//	}
	//earlier we have returned a string msg , now we will have a JSON response
    @GetMapping(path="/helloworldbean")
    public HelloworldBean helloworldbean() {
    	return new HelloworldBean("Hello Guys!");
    }
    //using path parameter
    @GetMapping(path="/helloworldbean/path-variable/{name}")
    public HelloworldBean helloworldpath(@PathVariable String name){
    	return new HelloworldBean(String.format("Hello ,%s",name));
    }
}

