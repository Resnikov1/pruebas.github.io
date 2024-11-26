package com.app.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.web.dao.GrupoDao;
import com.app.web.dao.MedidoresConsultaDao;
import com.app.web.dao.RutaDao;
import com.app.web.model.Grupo;
import com.app.web.model.MedidoresConsulta;
import com.app.web.model.Ruta;

@Controller
public class MedidoresController {

	@Autowired
	private MedidoresConsultaDao medidoresConsultaDao;
	
	@Autowired
	private RutaDao rutaDao;
	
	@Autowired
	private GrupoDao grupoDao;

	@RequestMapping("/medidor")
	public ModelAndView medidores(HttpServletResponse response) throws IOException {
		List<MedidoresConsulta> medidores = medidoresConsultaDao.findAll();
		// Hacemos relacion a la pagina a la que queremos que muestre
		ModelAndView model = new ModelAndView("medidores");
		/*
		 * Tenemos que tener en cuenta que el nombre "medidores" es el que hagarraremos
		 * despues para hacer referencia en el HTML para hacer la relacion entre la
		 * pagina y lo que regresa de la base de datos
		 */
		model.addObject("medidores", medidores);
		return model;
	}

	@RequestMapping("/eliminar/{id_medidor}")
	public String EliminarMedidor(@PathVariable(name = "id_medidor") Long id_medidor) {
		MedidoresConsulta medidor = medidoresConsultaDao.buscarPorId(id_medidor);
		if (medidor != null) {
			System.out.println("Borrando medidor");
			medidoresConsultaDao.delete(medidor);
		}
		return "redirect:/medidor";
	}

	@RequestMapping("/editar/{id_medidor}")
	public ModelAndView EditarMedidor(@PathVariable(name = "id_medidor") Long id_meidor) {
		List<Ruta> rutas = rutaDao.findAll();
		List<Grupo> grupos = grupoDao.findAll();
		ModelAndView model = new ModelAndView("editarMedidor");
		MedidoresConsulta medidoresConsulta = medidoresConsultaDao.buscarPorId(id_meidor);
		model.addObject("medidoresConsulta", medidoresConsulta);
		model.addObject("rutas", rutas);
		model.addObject("grupos", grupos);
		return model;
	}

	@RequestMapping(value = "/guardarCambiosMedidor", method = RequestMethod.POST)
	public String guardarMedidor(@ModelAttribute("medidoresConsulta") MedidoresConsulta medidoresConsulta) {
		medidoresConsultaDao.actualizarMedidor(medidoresConsulta);
		return "redirect:/medidor";
	}

	@RequestMapping("/crearMedidor")
	public String CrearMedidor(Model model) {
		MedidoresConsulta medidoresConsulta = new MedidoresConsulta();
		List<Ruta> rutas = rutaDao.findAll();
		List<Grupo> grupos = grupoDao.findAll();
		model.addAttribute("medidoresConsulta", medidoresConsulta);
		model.addAttribute("rutas", rutas);
		model.addAttribute("grupos", grupos);
		return "crearMedidor";
	}

	@RequestMapping(value = "/guardarNuevoMedidor", method = RequestMethod.POST)
	public String guardarNuevoMedidor(@ModelAttribute("medidoresConsulta") MedidoresConsulta medidoresConsulta) {
		medidoresConsultaDao.guardarMedidor(medidoresConsulta);
		return "redirect:/medidor";
	}
}
