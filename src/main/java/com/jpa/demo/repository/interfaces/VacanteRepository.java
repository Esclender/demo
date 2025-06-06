package com.jpa.demo.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.demo.models.Vacante;

@Repository
public interface VacanteRepository extends JpaRepository<Vacante, Integer> {

}