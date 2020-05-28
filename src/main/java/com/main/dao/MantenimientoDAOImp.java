package com.main.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.Mantenimiento;
import com.main.model.Vehiculo;
@Repository
public class MantenimientoDAOImp implements MantenimientoDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(Mantenimiento mantenimiento) {
		long id = (Long)sessionFactory.getCurrentSession().save(mantenimiento);	
		return id;
	}

	@Override
	public Mantenimiento get(long id) {
		Mantenimiento m = (Mantenimiento) sessionFactory.getCurrentSession().createQuery("from Mantenimiento WHERE id="+id).list().get(0);
		return m;
	}

	@Override
	public List<Mantenimiento> list() {
		List<Mantenimiento> list = sessionFactory.getCurrentSession().createQuery("from Mantenimiento").list();
		return list;
	}

	@Override
	public void update(long id, Mantenimiento manteniento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		sessionFactory.getCurrentSession().delete(this.get(id));
		
	}

}
