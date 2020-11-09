package com.main.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.base.dao.MantenimientoDAO;
import com.main.base.model.Mantenimiento;

@Service
public class MantenimientoServiceImp implements MantenimientoService{

	@Autowired
	private MantenimientoDAO mantenimientoDAO;
	@Override
	@Transactional
	public long save(Mantenimiento mantenimiento) {
		long id = mantenimientoDAO.save(mantenimiento  );
		return id;
	}

	@Override
	@Transactional
	public Mantenimiento get(long id) {
		return mantenimientoDAO.get(id);
	}

	@Override
	@Transactional
	public List<Mantenimiento> list() {
		return mantenimientoDAO.list();
	}

	@Override
	@Transactional
	public void update(long id, Mantenimiento mantenimiento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(long id) {
		mantenimientoDAO.delete(id);
		
	}

}
