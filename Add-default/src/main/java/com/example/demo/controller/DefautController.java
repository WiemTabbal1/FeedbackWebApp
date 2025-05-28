package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dto.DefautDTO;

import com.example.demo.entity.Defaut;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.DefautRepository;
import com.example.demo.service.DefautService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/defaut")

public class DefautController {
	@Autowired
	private DefautRepository defautRepository;
	@Autowired
	private DefautService defautService;
	
	// get all employees
	@GetMapping("/defauts")
	public List<Defaut> getAllDefauts(){
		return defautRepository.findAll();
	}		
	
	// create employee rest api
	@PostMapping(path = "/save")
	public String saveDefaut(@RequestBody DefautDTO defautDTO)
	{
		String id = defautService.addDefaut(defautDTO);
		return id;
		
	}
	

	
	
	// get employee by id rest api
	@GetMapping("/defauts/{defautid}")
	public ResponseEntity<Defaut> getDefautById(@PathVariable Long id) {
		Defaut defaut1 = defautRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Default not exist with id :" + id));
		return ResponseEntity.ok(defaut1);
	}
	
	// update employee rest api
	
	@PutMapping("/{id}")
	public ResponseEntity<Defaut> updateDefaut(@PathVariable Long id, @RequestBody Defaut defautDetails){
		Defaut defaut1 = defautRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Default not exist with id :" + id));
		
	
		defaut1.setDate(defautDetails.getDate());
		defaut1.setMatriculeeq(defautDetails.getMatriculeeq());
		defaut1.setMatriculepo(defautDetails.getMatriculepo());
		defaut1.setKsk(defautDetails.getKsk());
		defaut1.setCode(defautDetails.getCode());
		defaut1.setPosition(defautDetails.getPosition());
		defaut1.setCase(defautDetails.getCase());
		defaut1.setTackt(defautDetails.getTackt());
		defaut1.setMatriculefautif(defautDetails.getMatriculefautif());
		
		
		Defaut updateddefaut = defautRepository.save(defaut1);
		return ResponseEntity.ok(updateddefaut);
	}
	
	// delete employee rest api
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteDefaut(@PathVariable Long id){
		Defaut defaut1 = defautRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Default not exist with id :" + id));
		
		defautRepository.delete(defaut1);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	

}
