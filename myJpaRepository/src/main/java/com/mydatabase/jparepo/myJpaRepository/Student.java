package com.mydatabase.jparepo.myJpaRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    
	@Id
	private long id;
	private String name;
	private String status;
	
	public Student() {}
	
	public Student(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
}
