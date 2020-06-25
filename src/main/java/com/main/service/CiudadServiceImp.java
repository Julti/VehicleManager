package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.dao.CiudadDAO;
import com.main.model.Ciudad;

@Service
public class CiudadServiceImp implements CiudadService{

	@Autowired
	private CiudadDAO ciudadDAO;
	
	@Override
	@Transactional
	public Ciudad get(long id) {
		return ciudadDAO.get(id);
	}

	

}
