package com.jpa.demo.services;

import java.util.Optional;

import com.jpa.demo.models.Usuarios;

//import com.jpa.demo.models.Usuarios;

public interface IUsuarioService {

  public void guardar(Usuarios usuarios);

  public void guardarTodo(Iterable<Usuarios> usuarioss);

  public Iterable<Usuarios> buscarTodos();

  public Optional<Usuarios> buscarId(Integer id);

  public boolean existe(Integer id);

  public void modificar(Integer id);

  public void eliminar(Integer id);

  public void eliminarTodos();

  public Iterable<Usuarios> generateUsuariossMockData();
}