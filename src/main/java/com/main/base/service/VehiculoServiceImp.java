package com.main.base.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.base.dao.VehiculoDAO;
import com.main.base.dao.VehiculoDAOImp;
import com.main.base.dto.QueryResponse;
import com.main.base.model.Vehiculo;

@Service
public class VehiculoServiceImp implements VehiculoService{
	
	@Autowired
	private VehiculoDAO VehiculoDAO;
	
	@Override
	@Transactional
	public QueryResponse save(Vehiculo vehiculo) {
		QueryResponse qr =VehiculoDAO.save(vehiculo);
		return qr;
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
