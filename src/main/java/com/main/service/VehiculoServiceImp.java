package com.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.VehiculoDAO;
import com.main.dao.VehiculoDAOImp;
import com.main.model.Vehiculo;

@Service
public class VehiculoServiceImp implements VehiculoService{
	
	@Autowired
	private VehiculoDAO VehiculoDAO;
	
	@Override
	@Transactional
	public long save(Vehiculo vehiculo) {
		VehiculoDAO.save(vehiculo);
		return 0;
	}

	@Override
	@Transactional
	public Vehiculo get(long id) {
		// TODO Auto-generated method stub
		return VehiculoDAO.get(id);
	}

	@Override
	@Transactional
	public List<Vehiculo> list() {
		return VehiculoDAO.list();
	}

	@Override
	@Transactional
	public void update(long id, Vehiculo vehiculo) {
		VehiculoDAO.update(id, vehiculo);
		
	}

	@Override
	@Transactional
	public void delete(long id) {
		VehiculoDAO.delete(id);
		
	}

}
