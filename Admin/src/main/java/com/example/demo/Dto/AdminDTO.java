package com.example.demo.Dto;

public class AdminDTO {
	    private int adminid;
	    private String adminname;
	    private String email;
	    private String password;
	 
	    public AdminDTO() {
	    }
	 
	    public AdminDTO(int adminid, String adminname, String email, String password) {
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

		@Override
	    public String toString() {
	        return "AdminDTO{" +
	                "adminid=" + adminid +
	                ", adminname='" + adminname + '\'' +
	                ", email='" + email + '\'' +
	                ", password='" + password + '\'' +
	                '}';
	    }

}
