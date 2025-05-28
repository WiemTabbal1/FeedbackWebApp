package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.AdminDTO;
import com.example.demo.Dto.LoginDTO;
import com.example.demo.Repo.AdminRepo;
import com.example.demo.entity.Admin;
import com.example.demo.reponse.LoginResponse;



@Service
public class AdminIMPL implements AdminService{
	
	@Autowired
    private AdminRepo adminRepo;
 
    @Autowired
    private PasswordEncoder passwordEncoder;
 

	@Override
	public String addAdmin(AdminDTO adminDTO) {
 
        Admin admin = new Admin(
 
        		adminDTO.getAdminid(),
        		adminDTO.getAdminname(),
        		adminDTO.getEmail(),
 
               this.passwordEncoder.encode(adminDTO.getPassword())
        );
 
        adminRepo.save(admin);
 
        return admin.getAdminname();
    }
	AdminDTO adminDTO;

	@Override
	public LoginResponse loginAdmin(LoginDTO loginDTO) {
        String msg = "";
        Admin admin1 = adminRepo.findByemail(loginDTO.getEmail());
        if (admin1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = admin1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Admin> admin = adminRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (admin.isPresent()) {
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
