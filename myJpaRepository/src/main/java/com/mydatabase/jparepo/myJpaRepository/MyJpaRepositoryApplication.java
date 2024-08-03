package com.mydatabase.jparepo.myJpaRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MyJpaRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyJpaRepositoryApplication.class, args);
	}
}
