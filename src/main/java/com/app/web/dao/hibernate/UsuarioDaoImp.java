package com.app.web.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.web.dao.UsuarioDao;
import com.app.web.model.Usuario;

@Repository
public class UsuarioDaoImp implements UsuarioDao {

	@Autowired
	protected SessionFactory sessionFactory;

	@Override
	public void guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(usuario);

		session.getTransaction().commit();
		session.close();

	}

}
