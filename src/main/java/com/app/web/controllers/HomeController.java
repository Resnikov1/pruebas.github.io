package com.app.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.web.dao.MedidoresConsultaDao;
import com.app.web.model.MedidoresConsulta;

@Controller
public class HomeController {

	@Autowired
	private MedidoresConsultaDao medidoresConsultaDao;

	// curl -X GET localhost:8080/ -H 'Content-type:application/json'
	@RequestMapping(value = "/")
	public ModelAndView home(HttpServletResponse response) throws IOException {
		return new ModelAndView("users");
	}

	@RequestMapping(value = "/test")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		List<MedidoresConsulta> medidores = medidoresConsultaDao.findAll();
		ModelAndView model = new ModelAndView("testing");
		/*
		 * Tenemos que tener en cuenta que el nombre "medidores" es el que hagarraremos
		 * despues para hacer referencia en el HTML para hacer la relacion entre la
		 * pagina y lo que regresa de la base de datos
		 */
		model.addObject("medidores", medidores);
		return model;
	}
}