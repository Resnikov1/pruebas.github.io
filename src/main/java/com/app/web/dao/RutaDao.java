package com.app.web.dao;

import java.util.List;

import com.app.web.model.Ruta;

public interface RutaDao {

	public List<Ruta> findAll();

	public Ruta buscarPorId(Long id_ruta);
	
	public void guardarRuta(Ruta ruta);
	

}
