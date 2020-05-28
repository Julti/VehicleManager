package com.main.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.model.Vehiculo;

@Repository
public interface VehiculoDAO {
	long save(Vehiculo vehiculo);
	Vehiculo get(long id);
	List<Vehiculo> list();
	void update(long id,Vehiculo vehiculo);
	void delete(long id);
	
}
