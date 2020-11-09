package com.main.base.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.base.dto.QueryResponse;
import com.main.base.model.Vehiculo;

@Repository
public class VehiculoDAOImp implements VehiculoDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public QueryResponse save(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		long id = (Long)sessionFactory.getCurrentSession().save(vehiculo);	
		QueryResponse qr = new QueryResponse("Success",id);
		return qr;
	}

	@Override
	public Vehiculo get(long id) {
		Vehiculo vehiculo = (Vehiculo) sessionFactory.getCurrentSession().createQuery("from Vehiculo WHERE id="+id).list().get(0);
		return vehiculo;
	}

	@Override
	public List<Vehiculo> list() {
		List<Vehiculo> list = sessionFactory.getCurrentSession().createQuery("from Vehiculo").list();
		return list;
	}

	@Override
	public void update(long id, Vehiculo vehiculo) {
		Session sess = sessionFactory.getCurrentSession();
		Vehiculo toUpdate =sess.load(Vehiculo.class,id);
		toUpdate.setMarca(vehiculo.getMarca());
		toUpdate.setPlaca(vehiculo.getPlaca());
		sess.update(toUpdate);
	}

	@Override
	public void delete(long id) {
		sessionFactory.getCurrentSession().delete(this.get(id));
		
	}

}
