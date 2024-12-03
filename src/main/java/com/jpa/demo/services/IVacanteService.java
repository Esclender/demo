package com.jpa.demo.services;

import java.util.Optional;

import org.springframework.data.domain.Sort;

import com.jpa.demo.models.Categoria;
import com.jpa.demo.models.Vacante;

public interface IVacanteService {

  public void guardar();

  public void guardarTodo(Iterable<Vacante> Vacantes);

  public Iterable<Vacante> buscarTodosPaginadoOrdenados(int pageNo, int pageSize, Sort sort);

  public Optional<Vacante> buscarId(Integer id);

  public void existe(Integer id);

  public void modificar(Integer id);

  public void eliminar(Integer id);

  public void eliminarTodos();

  public Iterable<Vacante> generateVacantesMockData();
}