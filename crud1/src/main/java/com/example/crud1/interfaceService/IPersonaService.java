package com.example.crud1.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.crud1.model.Persona;

public interface IPersonaService {
	public List<Persona> listar();
	public Optional<Persona> listarbyId(int id);
	public int savePersona(Persona p);
	public void delete(int id);
	
	
}
