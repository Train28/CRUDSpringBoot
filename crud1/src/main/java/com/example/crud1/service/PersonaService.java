package com.example.crud1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud1.interfaceService.IPersonaService;
import com.example.crud1.interfaces.IPersona;
import com.example.crud1.model.Persona;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersona dataJPA;
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return (List<Persona>)dataJPA.findAll();
	}

	@Override
	public Optional<Persona> listarbyId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int savePersona(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
