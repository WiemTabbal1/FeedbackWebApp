package com.example.demo.payload.reponse;

public class AddMessage {
	String message;
    Boolean status;
 
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
 
    public AddMessage(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }

}
