package com.app.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.web.dao.UsuarioDao;
import com.app.web.model.Usuario;

@Controller
public class UsuarioControlller {

	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping("/crearUsuario")
	public String CrearUsuario(Model model) {

		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);

		return "crearUsuario";
	}

	@RequestMapping(value = "/guardarNuevoUsuario", method = RequestMethod.POST)
	public String guardarNuevoUsuario(@ModelAttribute("usuario") Usuario usuario) {
		usuarioDao.guardarUsuario(usuario);
		return "redirect:/medidor";
	}
}
