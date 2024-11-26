package com.app.web.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.web.dao.UserDao;
import com.app.web.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	protected SessionFactory sessionFactory;

	@Override
	public List<User> findAll() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		List<User> usuarios = session.createQuery("select a from User a").list();

		session.getTransaction();
		session.close();

		return usuarios;
	}

	@Override
	public void guardarUsuario(User user) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();
		session.close();
	}

}
