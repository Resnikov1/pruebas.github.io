package com.app.web.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.web.dao.RutaDao;
import com.app.web.model.Ruta;

@Repository
public class RutaDaoImp implements RutaDao {

	@Autowired
	protected SessionFactory sessionFactory;

	@Override
	public List<Ruta> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		List<Ruta> ruta = session.createQuery("select r from Ruta r").list();

		session.getTransaction();
		session.close();
		return ruta;
	}

	@Override
	public Ruta buscarPorId(Long id_ruta) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Ruta ruta = session.find(Ruta.class, id_ruta);

		session.getTransaction().commit();
		session.close();

		return ruta;
	}

	@Override
	public void guardarRuta(Ruta ruta) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(ruta);

		session.getTransaction().commit();
		session.close();
	}

}
