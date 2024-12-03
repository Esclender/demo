package com.jpa.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demo.models.Solicitud;
import com.jpa.demo.repository.interfaces.SolicitudesRepository;
import com.jpa.demo.services.ISolicitudesService;

@Service
public class SolicitudesServiceImpl implements ISolicitudesService {

  @Autowired
  private SolicitudesRepository solicitudesRepository;

  @Override
  public Iterable<Solicitud> buscarTodos() {
    return solicitudesRepository.findAll();
  }

}
