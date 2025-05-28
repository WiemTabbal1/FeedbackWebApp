package com.example.RegisterLogin.Dto;



public class LoginDTO {
private String numerostation;
private String password;
 
public LoginDTO() {
}
 
public LoginDTO(String numerostation, String password) {
this.numerostation = numerostation;
this.password = password;
}

public String getNumerostation() {
	return numerostation;
}

public void setNumerostation(String numerostation) {
	this.numerostation = numerostation;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}
