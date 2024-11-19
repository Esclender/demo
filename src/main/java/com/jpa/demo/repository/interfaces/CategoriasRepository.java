package com.jpa.demo.repository.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.demo.models.Categoria;

@Repository
public interface CategoriasRepository extends CrudRepository<Categoria, Integer> {

}
