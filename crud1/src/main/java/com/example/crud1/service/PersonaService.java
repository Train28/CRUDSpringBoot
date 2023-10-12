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
		return dataJPA.findById(id);
	}

	@Override
	public int savePersona(Persona p) {
		int res = 0;
		Persona person = dataJPA.save(p);
		if (!person.equals(null)) {
			res=1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {

		dataJPA.deleteById(id);
	}

}
