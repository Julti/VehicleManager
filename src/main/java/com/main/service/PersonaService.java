package com.main.service;

import java.util.List;

import com.main.dto.QueryResponse;
import com.main.model.Persona;
import com.main.model.Vehiculo;

public interface PersonaService {
	QueryResponse save(Persona persona);
	Persona get(long id);
	List<Persona> list();
	void update(long id,Persona persona);
	void delete(long id);
}
