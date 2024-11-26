package com.app.web.dao;

import java.util.List;

import com.app.web.model.MedidoresConsulta;

public interface MedidoresConsultaDao {

	public List<MedidoresConsulta> findAll();

	public void delete(MedidoresConsulta medidoresConsulta);

	public MedidoresConsulta buscarPorId(long id_medidor);
	
	public void guardarMedidor(MedidoresConsulta medidoresConsulta);
	
	public void actualizarMedidor(MedidoresConsulta medidoresConsulta);

}