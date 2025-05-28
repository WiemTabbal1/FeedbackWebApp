package com.example.demo.service;

import com.example.demo.dto.DefautDTO;
import com.example.demo.entity.Defaut;



public interface DefautService {
	
	  String addDefaut(DefautDTO defautDTO);
	  Defaut updateDefaut(Defaut d);
	 void deleteDefaut(Long defautid);
	 

}
