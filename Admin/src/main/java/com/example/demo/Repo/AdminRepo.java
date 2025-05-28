package com.example.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Admin;





@EnableJpaRepositories
@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer> {
	Optional<Admin> findOneByEmailAndPassword(String email, String password);
	 
    Admin findByemail(String email);

}
