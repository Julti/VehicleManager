package com.main.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.dto.QueryResponse;
import com.main.model.Persona;

@Repository
public class PersonaDAOImp implements PersonaDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public QueryResponse save(Persona Persona) {
		// TODO Auto-generated method stub
		long id = (Long)sessionFactory.getCurrentSession().save(Persona);	
		QueryResponse qr = new QueryResponse("Success",id);
		return qr;
	}

	@Override
	public Persona get(long id) {
		Persona Persona = (Persona) sessionFactory.getCurrentSession().createQuery("from Persona WHERE id="+id).list().get(0);
		return Persona;
	}

	@Override
	public List<Persona> list() {
		List<Persona> list = sessionFactory.getCurrentSession().createQuery("from Persona").list();
		return list;
	}

	@Override
	public void update(long id, Persona Persona) {
		Session sess = sessionFactory.getCurrentSession();
		Persona toUpdate =sess.load(Persona.class,id);
		/*toUpdate.(Persona.getMarca());
		toUpdate.setPlaca(Persona.getPlaca());*/
		sess.update(toUpdate);
	}

	@Override
	public void delete(long id) {
		sessionFactory.getCurrentSession().delete(this.get(id));
		
	}

}
