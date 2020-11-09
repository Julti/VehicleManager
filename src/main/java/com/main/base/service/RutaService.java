package com.main.base.service;

import java.util.List;

import com.main.base.model.Ruta;

public interface RutaService {
	long save(Ruta Ruta);
	Ruta get(long id);
	List<Ruta> list();
	void update(long id,Ruta Ruta);
	void delete(long id);
}
