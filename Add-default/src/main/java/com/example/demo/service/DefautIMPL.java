package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DefautDTO;

import com.example.demo.entity.Defaut;
import com.example.demo.repository.DefautRepository;



@Service
public class DefautIMPL implements DefautService{
	
	@Autowired
    private DefautRepository defautRepository;
	
	@Override
    public String addDefaut(DefautDTO defautDTO) {
 
        Defaut defaut = new Defaut(
        		defautDTO.getDefautid(),
        		defautDTO.getDate(),
        		defautDTO.getMatriculeeq(),
        		defautDTO.getMatriculepo(),
        		defautDTO.getKsk(),
        		defautDTO.getCode(),
        		defautDTO.getPosition(),
                defautDTO.getCase(),
                defautDTO.getTackt(),
                defautDTO.getMatriculefautif()
        		
                );
 
        defautRepository.save(defaut);
 
        return defaut.getKsk();
    }
	
	@Override
	public void deleteDefaut(Long defautid) {
		 
		defautRepository.deleteById( defautid);
    }
	
	@Override
	public Defaut updateDefaut(Defaut d) {
	return defautRepository.saveAndFlush(d);
	}
	
    DefautDTO defautDTO;

	

}
