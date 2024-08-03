package com.mydatabase.jparepo.myJpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class StudentCmdLineRunner implements CommandLineRunner{

	@Autowired
	public StudentJpaRepository student;
	
	@Override
	public void run(String... args) throws Exception {
	
		student.save(new Student(1,"Dan","Done"));
		student.save(new Student(2,"Tony","Done"));
		student.save(new Student(3,"Bruce","notDone"));
		student.save(new Student(4,"Tom","notDone"));
		student.save(new Student(5,"Merlin","Done"));
		System.out.println(student.findById(3l).toString());
		System.out.println(student.findByName("Dan").toString());
		System.out.println(student.findByStatus("notDone").toString());
	}
}
