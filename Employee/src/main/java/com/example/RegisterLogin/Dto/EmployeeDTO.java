package com.example.RegisterLogin.Dto;

public class EmployeeDTO {
	 
    private int employeeid;
    private String employeename;
    private String numerostation;
    private String password;
 
    public EmployeeDTO() {
    }
 
    public EmployeeDTO(int employeeid, String employeename, String numerostation, String password) {
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
 
    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", numerostation='" + numerostation + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
