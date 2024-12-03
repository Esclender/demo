package com.jpa.demo.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.jpa.demo.models.Categoria;
import com.jpa.demo.repository.interfaces.CategoriasRepository;
import com.jpa.demo.services.ICategoriaService;

import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

  @Autowired
  private CategoriasRepository categoriasRepository;

  @Override
  public void guardar(Categoria categoria) {
    categoriasRepository.save(categoria);
  }

  @Override
  public void guardarTodo(Iterable<Categoria> categorias) {
    categoriasRepository.saveAll(categorias);
  }

  @Override
  public Iterable<Categoria> buscarTodos() {
    Iterable<Categoria> categorias = categoriasRepository.findAll();
    System.out.println("Categorías encontradas: " + categorias);
    return categorias;
  }

  @Override
  public Optional<Categoria> buscarId(Integer id) {
    Categoria categoria = categoriasRepository.findById(id).orElse(null);
    System.out.println("Categoría encontrada: " + categoria);
    return Optional.of(categoria);
  }

  @Override
  public boolean existe(Integer id) {
    return categoriasRepository.existsById(id);
  }

  @Override
  public void modificar(Integer id) {
    Categoria categoria = categoriasRepository.findById(id).get();
    categoriasRepository.save(categoria);
  }

  @Override
  public void eliminar(Integer id) {
    categoriasRepository.deleteById(id);
  }

  @Override
  public void eliminarTodos() {
    categoriasRepository.deleteAll();
  }

  @Override
  public Iterable<Categoria> generateCategoriasMockData() {
    // GIVE ME 3 INSTANCES OF CATEGORIA
    List<Categoria> categorias = new ArrayList<>();
    categorias.add(new Categoria("Programación", "Desarrollo de software"));
    categorias.add(new Categoria("Diseño", "Diseño gráfico"));
    categorias.add(new Categoria("Administración", "Administración de empresas"));

    return categorias;
  }

  @Override
  public Iterable<Categoria> buscarTodosPaginado(int pageNo, int pageSize) {
    return categoriasRepository.findAll(PageRequest.of(pageNo, pageSize));
  }

  @Override
  public Iterable<Categoria> buscarTodosPaginadoOrdenados(int pageNo, int pageSize, Sort sort) {
    return categoriasRepository.findAll(PageRequest.of(pageNo, pageSize, sort));
  }
}
