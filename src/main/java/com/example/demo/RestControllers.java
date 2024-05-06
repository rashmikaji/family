package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

	
	@GetMapping("/set")
	public ResponseEntity<Persons>get(){
		
		Persons p = new Persons();
		p.setName("mithi");
		p.setAge(12);
		p.setCity("bhandara");
		
		return new ResponseEntity<Persons>(p,HttpStatus.OK);
		
	}
}