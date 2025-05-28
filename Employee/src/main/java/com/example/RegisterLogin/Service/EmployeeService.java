package com.example.RegisterLogin.Service;


import java.util.List;

import com.example.RegisterLogin.Dto.EmployeeDTO;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Entity.Employee;
import com.example.RegisterLogin.payload.response.LoginMesage;
import com.example.RegisterLogin.response.LoginResponse;



public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
 
    LoginResponse loginEmployee(LoginDTO loginDTO);
  
    
 
}
