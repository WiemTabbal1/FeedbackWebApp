package com.example.RegisterLogin.Repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.RegisterLogin.Entity.Employee;

 

@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{

	Employee findById(Long id);
	Optional<Employee> findOneByNumerostationAndPassword(String Numerostation, String password);

	Employee findBynumerostation(String numerostation);
   
}