package com.example.crud1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.crud1.interfaceService.IPersonaService;
import com.example.crud1.interfaces.IPersona;
import com.example.crud1.model.Persona;

import jakarta.validation.Valid;

@Controller
public class Controlador {

	@Autowired
	private IPersonaService service;

	@GetMapping("/listar")
	public String listar(Model model) {

		List<Persona> personas = service.listar();
		model.addAttribute("personas", personas);
		return "index";
	}

	@GetMapping("/new")
	public String redirect(Model model) {
		model.addAttribute("persona", new Persona());

		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Valid Persona p, Model model) {
		service.savePersona(p);
		return "redirect:/confirmacion";
	}
	
	@GetMapping("/confirmacion")
	public String confir() {

	
		return "confirmacion";
	}
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Persona> persona = service.listarbyId(id);
		model.addAttribute("persona", persona);

		return "form2";
	}
	
	@GetMapping("/delete/{id}")
	public String borrar(@PathVariable int id, Model model) {
		
		
		service.delete(id);

		return "redirect:/listar";
	}
	
	

}
