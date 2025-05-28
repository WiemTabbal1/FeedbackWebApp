package com.example.demo.response;

public class AddResponse {
	String message;
	Boolean status;
	
	public AddResponse(String message, Boolean status) {
		
		this.message = message;
		this.status = status;
	}

	public AddResponse() {
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
