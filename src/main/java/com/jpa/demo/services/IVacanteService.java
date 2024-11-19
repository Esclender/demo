package com.jpa.demo.services;

import com.jpa.demo.models.Vacante;

public interface IVacanteService {

  public void guardar();

  public void guardarTodo(Iterable<Vacante> Vacantes);

  public void buscarTodos();

  public void buscarId(Integer id);

  public void existe(Integer id);

  public void modificar(Integer id);

  public void eliminar(Integer id);

  public void eliminarTodos();

  public Iterable<Vacante> generateVacantesMockData();
}