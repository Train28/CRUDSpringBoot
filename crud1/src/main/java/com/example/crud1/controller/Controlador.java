package com.example.crud1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.crud1.interfaceService.IPersonaService;
import com.example.crud1.interfaces.IPersona;
import com.example.crud1.model.Persona;

@Controller
public class Controlador {

	@Autowired
	private IPersonaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Persona> personas =service.listar();
		model.addAttribute("personas", personas);		
		return "index";
	}
	
}
