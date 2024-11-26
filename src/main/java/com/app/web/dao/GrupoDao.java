package com.app.web.dao;

import java.util.List;

import com.app.web.model.Grupo;

public interface GrupoDao {

	public List<Grupo> findAll();

	public void guardarGrupo(Grupo grupo);

}
