package com.main.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.dto.QueryResponse;
import com.main.model.Persona;
import com.main.model.Vehiculo;

@Repository
public interface PersonaDAO {
	QueryResponse save(Persona vehiculo);
	Persona get(long id);
	List<Persona> list();
	void update(long id,Persona vehiculo);
	void delete(long id);
	
}
