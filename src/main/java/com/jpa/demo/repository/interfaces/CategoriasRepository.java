package com.jpa.demo.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.demo.models.Categoria;

@Repository
public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

}
