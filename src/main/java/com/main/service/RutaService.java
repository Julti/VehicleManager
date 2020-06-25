package com.main.service;

import java.util.List;

import com.main.model.Ruta;

public interface RutaService {
	long save(Ruta Ruta);
	Ruta get(long id);
	List<Ruta> list();
	void update(long id,Ruta Ruta);
	void delete(long id);
}
