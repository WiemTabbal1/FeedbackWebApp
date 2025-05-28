package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.Repo.AdminRepo;
import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;



@SpringBootApplication


public class AdminApplication implements CommandLineRunner {
	
	@Autowired 
	AdminRepo adminRepository;
	@Autowired 
	AdminService adminService;

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
	
		
		
		
	}

}
