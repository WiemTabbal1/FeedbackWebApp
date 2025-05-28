package com.example.demo.service;

import com.example.demo.Dto.AdminDTO;
import com.example.demo.Dto.LoginDTO;
import com.example.demo.reponse.LoginResponse;

public interface AdminService {
	String addAdmin(AdminDTO adminDTO);
	 
    LoginResponse loginAdmin(LoginDTO loginDTO);

}
