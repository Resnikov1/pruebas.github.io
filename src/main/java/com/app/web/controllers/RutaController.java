package com.app.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.web.dao.RutaDao;
import com.app.web.model.Ruta;

@Controller
public class RutaController {

	@Autowired
	private RutaDao rutaDao;

	@RequestMapping("/crearRuta")
	public String CrearRuta(Model model) {

		Ruta ruta = new Ruta();
		model.addAttribute("ruta", ruta);

		return "crearRuta";
	}

	@RequestMapping(value = "/guardarNuevaRuta", method = RequestMethod.POST)
	public String guardarNuevaRuta(@ModelAttribute("ruta") Ruta ruta) {
		rutaDao.guardarRuta(ruta);
		return "redirect:/medidor";
	}

}
