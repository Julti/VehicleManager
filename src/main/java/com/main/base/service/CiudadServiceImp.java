package com.main.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.base.dao.CiudadDAO;
import com.main.base.model.Ciudad;

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
