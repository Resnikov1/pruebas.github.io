package com.app.web.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.web.dao.MedidoresConsultaDao;
import com.app.web.model.MedidoresConsulta;

@Repository
public class MedidoresConsultaDoaOImpl implements MedidoresConsultaDao {

	@Autowired
	protected SessionFactory sessionFactory;

	// Controlador que muestra todos los medidores que tenemos en la base de datos
	@Override
	public List<MedidoresConsulta> findAll() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		/*
		 * Para usar esta QUERY estamos usando notacion HQL, donde MedidoresConsulta
		 * representa el nombre de una clase Para mas informacion:
		 * https://rua.ua.es/dspace/bitstream/10045/106986/1/Consultas-con-Hibernate.pdf
		 */
		List<MedidoresConsulta> medidores = session.createQuery("select m from MedidoresConsulta m").list();

		session.getTransaction();
		session.close();
		return medidores;
	}

	// Controlador que elimina
	@Override
	public void delete(MedidoresConsulta medidoresConsulta) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		MedidoresConsulta medi = session.find(MedidoresConsulta.class, medidoresConsulta.getId_medidor());
		session.delete(medi);

		session.getTransaction().commit();
		session.close();

	}

	// Controlador que busca un medidor por ID
	@Override
	public MedidoresConsulta buscarPorId(long id_medidor) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		MedidoresConsulta medidor = session.find(MedidoresConsulta.class, id_medidor);

		session.getTransaction().commit();
		session.close();
		return medidor;
	}

	// Controlador que guarda un medidor
	@Override
	public void guardarMedidor(MedidoresConsulta medidoresConsulta) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(medidoresConsulta);

		session.getTransaction().commit();
		session.close();

	}

	// Controlador que Actualiza un medidor existente
	@Override
	public void actualizarMedidor(MedidoresConsulta medidoresConsulta) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.update(medidoresConsulta);

		session.getTransaction().commit();
		session.close();

	}

}