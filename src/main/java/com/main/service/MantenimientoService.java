package com.main.service;

import java.util.List;

import com.main.model.Mantenimiento;

public interface MantenimientoService {
	long save(Mantenimiento mantenimiento);
	Mantenimiento get(long id);
	List<Mantenimiento> list();
	void update(long id,Mantenimiento mantenimiento);
	void delete(long id);
}
