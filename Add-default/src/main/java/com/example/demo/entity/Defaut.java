package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "defaut")

public class Defaut {
	
	
	
	@Id
    @Column(name="defaut_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long defautid;
	
	@Column(name = "date_heure")
	private Date date;
	
	@Column(name = "matricule_chef_dequipe")
	private String matriculeeq;
	
	@Column(name = "matricule_chef_deposte")
	private String matriculepo;
	
	@Column(name = "numéro_ksk")
	private String ksk;
	
	@Column(name = "code_défaut")
	private String code;

	@Column(name = "position")
	private String position;
	
	@Column(name = "numéro_case")
	private String Case;
	
	@Column(name = "Tackt")
	private String Tackt;
	
	@Column(name = "matriculefautif")
    private String matriculefautif;

	public Defaut() {
		
	}



	
	



	








	public Defaut(Long defautid, Date date, String matriculeeq, String matriculepo, String ksk, String code,
			String position, String case1, String tackt, String matriculefautif) {
		
		this.defautid = defautid;
		this.date = date;
		this.matriculeeq = matriculeeq;
		this.matriculepo = matriculepo;
		this.ksk = ksk;
		this.code = code;
		this.position = position;
		Case = case1;
		Tackt = tackt;
		this.matriculefautif = matriculefautif;
	}

















	public String getTackt() {
		return Tackt;
	}



	public void setTackt(String tackt) {
		Tackt = tackt;
	}



	


	



	public String getMatriculefautif() {
		return matriculefautif;
	}








	public void setMatriculefautif(String matriculefautif) {
		this.matriculefautif = matriculefautif;
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
