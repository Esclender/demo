package com.jpa.demo.services;

import java.util.Optional;

import org.springframework.data.domain.Sort;

import com.jpa.demo.models.Categoria;

public interface ICategoriaService {

  public void guardar(Categoria categoria);

  public void guardarTodo(Iterable<Categoria> categorias);

  public Iterable<Categoria> buscarTodos();

  public Optional<Categoria> buscarId(Integer id);

  public Iterable<Categoria> buscarTodosPaginado(int pageNo, int pageSize);

  public Iterable<Categoria> buscarTodosPaginadoOrdenados(int pageNo, int pageSize, Sort sort);

  public boolean existe(Integer id);

  public void modificar(Integer id);

  public void eliminar(Integer id);

  public void eliminarTodos();

  public Iterable<Categoria> generateCategoriasMockData();
}
