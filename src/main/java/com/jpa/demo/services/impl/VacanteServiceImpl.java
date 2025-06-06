package com.jpa.demo.services.impl;

import java.util.Optional;
import java.lang.foreign.Linker.Option;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.jpa.demo.repository.interfaces.VacanteRepository;
import com.jpa.demo.services.ICategoriaService;
import com.jpa.demo.services.IVacanteService;

import org.springframework.stereotype.Service;

import com.jpa.demo.models.Categoria;
import com.jpa.demo.models.Vacante;

@Service
public class VacanteServiceImpl implements IVacanteService {

  @Autowired
  private VacanteRepository vacantesRepository;

  @Autowired
  private ICategoriaService categoriaService;

  @Override
  public void guardar() {
    Vacante vacante = new Vacante();
    Optional<Categoria> categoria = categoriaService.buscarId(1);
    if (categoria.isPresent()) {
      vacante.setNombre("Desarrollador Frontend");
      vacante.setDescripcion("Desarrolla interfaces de usuario atractivas");
      vacante.setFecha(new Date());
      vacante.setSalario(5000);
      vacante.setDestacado(1);
      vacante.setEstatus("Creada");
      vacante.setCategoria(categoria.get());
      vacantesRepository.save(vacante);
    }
    System.out.println(vacante);
  }

  @Override
  public void eliminarTodos() {
    vacantesRepository.deleteAll();
  }

  @Override
  public void existe(Integer id) {
    boolean existe = vacantesRepository.existsById(id);
    System.out.println("La vacante existe: " + existe);
  }

  @Override
  public Optional<Vacante> buscarId(Integer id) {
    Optional<Vacante> vacante = vacantesRepository.findById(id);
    return vacante;
  }

  @Override
  public void guardarTodo(Iterable<Vacante> vacantes) {
    vacantesRepository.saveAll(vacantes);
  }

  @Override
  public Iterable<Vacante> generateVacantesMockData() {
    // List<Vacante> vacantes = new LinkedList<>();

    // Vacante vac1 = new Vacante();
    // vac1.setNombre("Programador Blockchain");
    // vac1.setDescripcion("Desarrolla soluciones blockchain");
    // vac1.setFecha(new Date());
    // vac1.setSalario(8000);
    // vac1.setDestacado(1);
    // vac1.setEstatus("Activa");

    // Vacante vac2 = new Vacante();
    // vac2.setNombre("Programador Java");
    // vac2.setDescripcion("Desarrolla aplicaciones en Java");
    // vac2.setFecha(new Date());
    // vac2.setSalario(6000);
    // vac2.setDestacado(0);
    // vac2.setEstatus("Inactiva");

    // Vacante vac3 = new Vacante();
    // vac3.setNombre("Programador Python");
    // vac3.setDescripcion("Desarrolla aplicaciones en Python");
    // vac3.setFecha(new Date());
    // vac3.setSalario(7000);
    // vac3.setDestacado(1);
    // vac3.setEstatus("Activa");

    // vacantes.add(vac1);
    // vacantes.add(vac2);
    // vacantes.add(vac3);

    // return vacantes;

    return null;
  }

  @Override
  public void modificar(Integer id) {
    Vacante vacante = vacantesRepository.findById(id).get();
    vacante.setNombre("Desarrollador Backend - MODIFICADO");
    vacantesRepository.save(vacante);
  }

  @Override
  public void eliminar(Integer id) {
    vacantesRepository.deleteById(id);
  }

  @Override
  public Iterable<Vacante> buscarTodosPaginadoOrdenados(int pageNo, int pageSize, Sort sort) {
    return vacantesRepository.findAll(PageRequest.of(pageNo, pageSize, sort));
  }

}
