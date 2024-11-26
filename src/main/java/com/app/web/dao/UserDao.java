package com.app.web.dao;

import java.util.List;

import com.app.web.model.User;

public interface UserDao {

	public List<User> findAll();

	public void guardarUsuario(User user);
}
