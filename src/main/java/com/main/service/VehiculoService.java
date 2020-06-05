package com.main.service;

import java.util.List;

import com.main.dto.QueryResponse;
import com.main.model.Vehiculo;

public interface VehiculoService {
	QueryResponse save(Vehiculo vehiculo);
	Vehiculo get(long id);
	List<Vehiculo> list();
	void update(long id,Vehiculo vehiculo);
	void delete(long id);
}
