package com.app.web.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.web.dao.UserDao;
import com.app.web.model.User;

@Controller
public class UserController {

	@Autowired
	private UserDao userDao;

	@RequestMapping("/login")
	public ModelAndView users(HttpServletResponse response) throws IOException {
		ModelAndView model = new ModelAndView("users");
		return model;
	}

	@RequestMapping(value = "/guardarUsuario", method = RequestMethod.POST)
	public String guardarUsuario(@ModelAttribute("user") User user) {
		userDao.guardarUsuario(user);
		return "redirect:/medidor";
	}
}
