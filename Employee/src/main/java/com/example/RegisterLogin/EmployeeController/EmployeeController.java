package com.example.RegisterLogin.EmployeeController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.example.RegisterLogin.Dto.EmployeeDTO;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Entity.Employee;
import com.example.RegisterLogin.Repo.EmployeeRepo;
import com.example.RegisterLogin.Service.EmployeeService;
import com.example.RegisterLogin.response.LoginResponse;




@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllDefauts(){
		return employeeRepo.findAll();
	}	
	@PostMapping(path = "/save")
	public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
	{
		String id = employeeService.addEmployee(employeeDTO);
		return id;
		
	}
	@PostMapping(path = "/login")
	public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
	{
		LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
		return ResponseEntity.ok(loginResponse);
		
	}
	
	


}
