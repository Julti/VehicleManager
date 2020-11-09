package com.main.base.service;

import java.util.List;

import com.main.base.dto.QueryResponse;
import com.main.base.model.Persona;
import com.main.base.model.Vehiculo;

public interface PersonaService {
	QueryResponse save(Persona persona);
	Persona get(long id);
	List<Persona> list();
	void update(long id,Persona persona);
	void delete(long id);
}
