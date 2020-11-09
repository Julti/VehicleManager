package com.main.base.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.base.dto.QueryResponse;
import com.main.base.model.Persona;
import com.main.base.model.Vehiculo;

@Repository
public interface PersonaDAO {
	QueryResponse save(Persona vehiculo);
	Persona get(long id);
	List<Persona> list();
	void update(long id,Persona vehiculo);
	void delete(long id);
	
}
