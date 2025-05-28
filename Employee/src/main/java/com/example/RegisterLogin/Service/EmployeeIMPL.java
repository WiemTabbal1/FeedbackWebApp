package com.example.RegisterLogin.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.example.RegisterLogin.Dto.EmployeeDTO;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Entity.Employee;
import com.example.RegisterLogin.Repo.EmployeeRepo;
import com.example.RegisterLogin.payload.response.LoginMesage;
import com.example.RegisterLogin.response.LoginResponse;


import java.util.Optional;
 
@Service
 
public class EmployeeIMPL implements EmployeeService {
 
    @Autowired
    private EmployeeRepo employeeRepo;
 
    @Autowired
    private PasswordEncoder passwordEncoder;
 
 
    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {
 
        Employee employee = new Employee(
 
                employeeDTO.getEmployeeid(),
                employeeDTO.getEmployeename(),
                employeeDTO.getNumerostation(),
 
               this.passwordEncoder.encode(employeeDTO.getPassword())
        );
 
        employeeRepo.save(employee);
 
        return employee.getEmployeename();
    }
    
   
    
    EmployeeDTO employeeDTO;
 
    @Override
    public LoginResponse  loginEmployee(LoginDTO loginDTO) {
        String msg = "";
        Employee employee1 = employeeRepo.findBynumerostation(loginDTO.getNumerostation());
        if (employee1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = employee1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Employee> employee = employeeRepo.findOneByNumerostationAndPassword(loginDTO.getNumerostation(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
 
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("number not exits", false);
        }
 
 
    }
 
}