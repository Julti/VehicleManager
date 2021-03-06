package com.main.base.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.base.model.Ruta;

@Repository
public interface RutaDAO{
	long save(Ruta ruta);
	Ruta get(long id);
	List<Ruta> list();
	void update(long id,Ruta ruta);
	void delete(long id);
}
