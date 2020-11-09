package com.main.base.service;

import java.util.List;

import com.main.base.dto.QueryResponse;
import com.main.base.model.Vehiculo;

public interface VehiculoService {
	QueryResponse save(Vehiculo vehiculo);
	Vehiculo get(long id);
	List<Vehiculo> list();
	void update(long id,Vehiculo vehiculo);
	void delete(long id);
}
