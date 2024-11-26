package com.app.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.web.dao.GrupoDao;
import com.app.web.model.Grupo;

@Controller
public class GrupoController {

	@Autowired
	private GrupoDao grupoDao;

	@RequestMapping("/crearGrupo")
	public String CrearRuta(Model model) {

		Grupo grupo = new Grupo();
		model.addAttribute("grupo", grupo);

		return "crearGrupo";
	}

	@RequestMapping(value = "/guardarNuevoGrupo", method = RequestMethod.POST)
	public String guardarNuevoGrupo(@ModelAttribute("grupo") Grupo grupo) {
		grupoDao.guardarGrupo(grupo);
		return "redirect:/medidor";
	}
}
