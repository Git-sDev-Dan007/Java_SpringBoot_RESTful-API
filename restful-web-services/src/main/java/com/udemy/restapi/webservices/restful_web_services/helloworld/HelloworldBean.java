package com.udemy.restapi.webservices.restful_web_services.helloworld;

public class HelloworldBean {

	private String string;

	public HelloworldBean(String string) {
		this.string=string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "HelloworldBean [string=" + string + "]";
	}
    
}
