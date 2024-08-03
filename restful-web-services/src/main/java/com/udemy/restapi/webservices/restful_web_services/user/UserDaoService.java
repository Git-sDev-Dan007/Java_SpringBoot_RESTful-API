package com.udemy.restapi.webservices.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
//To talk to the database we have to use either=>JPA /Hibernate
   //for now we r going to create list & use UserDaoService to talk to the list
	
	private static List<User>users=new ArrayList<>();

	static {
		users.add(new User(1,"Dan",LocalDate.now().minusYears(20)));
		users.add(new User(2,"Eve",LocalDate.now().minusYears(3)));
		users.add(new User(3,"Joe",LocalDate.now().minusYears(5)));
	}
	
	public List<User> findAll(){
		return users;
	}
	//public User save(User user)
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}
}
