package com.app.web.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.web.dao.GrupoDao;
import com.app.web.model.Grupo;

@Repository
public class GrupoDaoImp implements GrupoDao {

	@Autowired
	protected SessionFactory sessionFactory;

	@Override
	public List<Grupo> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		List<Grupo> grupo = session.createQuery("select g from Grupo g").list();

		session.getTransaction();
		session.close();
		return grupo;
	}

	@Override
	public void guardarGrupo(Grupo grupo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(grupo);

		session.getTransaction().commit();
		session.close();
	}

}
