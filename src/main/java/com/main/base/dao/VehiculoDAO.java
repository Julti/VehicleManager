package com.main.base.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.base.dto.QueryResponse;
import com.main.base.model.Vehiculo;

@Repository
public interface VehiculoDAO {
	QueryResponse save(Vehiculo vehiculo);
	Vehiculo get(long id);
	List<Vehiculo> list();
	void update(long id,Vehiculo vehiculo);
	void delete(long id);
	
}
