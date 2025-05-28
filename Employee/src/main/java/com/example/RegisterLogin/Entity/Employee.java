package com.example.RegisterLogin.Entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name="employee")
public class Employee {
 
    @Id
    @Column(name="employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;
 
    @Column(name="employee_name", length = 255)
    private String employeename;
 
    @Column(name="numerostation", length = 255)
    private String numerostation;
 
    @Column(name="password", length = 255)
    private String password;
 
 
    public Employee() {
    }
 
    public Employee(int employeeid, String employeename, String numerostation, String password) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.numerostation = numerostation;
        this.password = password;
    }

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
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