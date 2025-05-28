package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {

	@Id
    @Column(name="admin_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminid;
 
    @Column(name="admin_name", length = 255)
    private String adminname;
 
    @Column(name="email", length = 255)
    private String email;
 
    @Column(name="password", length = 255)
    private String password;
 
 
    public Admin() {
    }
 
    public Admin(int adminid, String adminname, String email, String password) {
        this.adminid = adminid;
        this.adminname = adminname;
        this.email = email;
        this.password = password;
    }

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
    
}
