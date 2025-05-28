package com.example.demo.dto;

import java.util.Date;

public class DefautDTO {
	private Long defautid;
	private Date date;
    private String matriculeeq;
    private String matriculepo;
    private String ksk;
    private String code;
    private String position;
    private String Case;
    private String Tackt;
    private String matriculefautif;
    
    
    
    
	public DefautDTO() {
		
	}





	public DefautDTO(Long defautid, Date date, String matriculeeq, String matriculepo, String ksk, String code,
			String position, String case1, String Tackt, String matriculefautif) {

		
		this.defautid = defautid;
		this.date = date;
		this.matriculeeq = matriculeeq;
		this.matriculepo = matriculepo;
		this.ksk = ksk;
		this.code = code;
		this.position = position;
		Case = case1;
		this.Tackt = Tackt;
		this.matriculefautif = matriculefautif;
	}
	
	





	public String getMatriculefautif() {
		return matriculefautif;
	}





	public void setMatriculefautif(String matriculefautif) {
		this.matriculefautif = matriculefautif;
	}





	public String getTackt() {
		return Tackt;
	}





	public void setTackt(String tackt) {
		Tackt = tackt;
	}





	public Long getDefautid() {
		return defautid;
	}





	public void setDefautid(Long defautid) {
		this.defautid = defautid;
	}





	public Date getDate() {
		return date;
	}





	public void setDate(Date date) {
		this.date = date;
	}





	public String getMatriculeeq() {
		return matriculeeq;
	}





	public void setMatriculeeq(String matriculeeq) {
		this.matriculeeq = matriculeeq;
	}





	public String getMatriculepo() {
		return matriculepo;
	}





	public void setMatriculepo(String matriculepo) {
		this.matriculepo = matriculepo;
	}





	public String getKsk() {
		return ksk;
	}





	public void setKsk(String ksk) {
		this.ksk = ksk;
	}





	public String getCode() {
		return code;
	}





	public void setCode(String code) {
		this.code = code;
	}





	public String getPosition() {
		return position;
	}





	public void setPosition(String position) {
		this.position = position;
	}





	public String getCase() {
		return Case;
	}





	public void setCase(String case1) {
		Case = case1;
	}
    
    
    

}
