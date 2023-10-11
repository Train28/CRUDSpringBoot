package com.example.crud1.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crud1.model.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
