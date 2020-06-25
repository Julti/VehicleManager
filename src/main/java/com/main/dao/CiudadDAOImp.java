package com.main.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.Ciudad;
@Repository
public class CiudadDAOImp implements CiudadDAO{

	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public Ciudad get(long id) {
		Ciudad m = (Ciudad) sessionFactory.getCurrentSession().createQuery("from Ciudad WHERE id="+id).list().get(0);
		return m;
	}


}
