package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.dao.RutaDAO;
import com.main.model.Ruta;

@Service
public class RutaServiceImp implements RutaService{

	@Autowired
	private RutaDAO RutaDAO;
	@Override
	@Transactional
	public long save(Ruta Ruta) {
		long id = RutaDAO.save(Ruta  );
		return id;
	}

	@Override
	@Transactional
	public Ruta get(long id) {
		return RutaDAO.get(id);
	}

	@Override
	@Transactional
	public List<Ruta> list() {
		return RutaDAO.list();
	}

	@Override
	@Transactional
	public void update(long id, Ruta Ruta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(long id) {
		RutaDAO.delete(id);
		
	}

}
