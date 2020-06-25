package com.main.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.Ruta;
import com.main.model.Vehiculo;
@Repository
public class RutaDAOImp implements RutaDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(Ruta ruta) {
		long id = (Long)sessionFactory.getCurrentSession().save(ruta);	
		return id;
	}

	@Override
	public Ruta get(long id) {
		Ruta m = (Ruta) sessionFactory.getCurrentSession().createQuery("from Ruta WHERE id="+id).list().get(0);
		return m;
	}

	@Override
	public List<Ruta> list() {
		List<Ruta> list = sessionFactory.getCurrentSession().createQuery("from Ruta").list();
		return list;
	}

	@Override
	public void update(long id, Ruta ruta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		sessionFactory.getCurrentSession().delete(this.get(id));
		
	}

}
