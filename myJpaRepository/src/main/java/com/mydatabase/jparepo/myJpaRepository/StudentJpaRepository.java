package com.mydatabase.jparepo.myJpaRepository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepository extends JpaRepository<Student,Long>{    
	
	Student findById(int id);
	Student findByName(String name);
	List<Student> findByStatus(String status);
}
