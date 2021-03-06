package com.main.base.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.base.model.Mantenimiento;

@Repository
public interface MantenimientoDAO{
	long save(Mantenimiento manteniento);
	Mantenimiento get(long id);
	List<Mantenimiento> list();
	void update(long id,Mantenimiento manteniento);
	void delete(long id);
}
