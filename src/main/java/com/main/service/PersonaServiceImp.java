package com.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dto.QueryResponse;
import com.main.model.Persona;
import com.main.dao.PersonaDAO;

@Service
public class PersonaServiceImp implements PersonaService{
	
	@Autowired
	private PersonaDAO PersonaDAO;
	
	@Override
	@Transactional
	public QueryResponse save(Persona Persona) {
		System.out.println(Persona.toString());
		QueryResponse qr =PersonaDAO.save(Persona);
		return qr;
	}

	@Override
	@Transactional
	public Persona get(long id) {
		// TODO Auto-generated method stub
		return PersonaDAO.get(id);
	}

	@Override
	@Transactional
	public List<Persona> list() {
		return PersonaDAO.list();
	}

	@Override
	@Transactional
	public void update(long id, Persona Persona) {
		PersonaDAO.update(id, Persona);
		
	}

	@Override
	@Transactional
	public void delete(long id) {
		PersonaDAO.delete(id);
		
	}

}
