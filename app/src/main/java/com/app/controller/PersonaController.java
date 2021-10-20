package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.properties.PersonaProperties;

@RestController
public class PersonaController {

	@Autowired
	private PersonaProperties p;
	
	@GetMapping("/nombre")
	public String getNombre() {
		return p.getNombre();
	}
}
