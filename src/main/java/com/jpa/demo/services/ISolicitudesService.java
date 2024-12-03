package com.jpa.demo.services;

import com.jpa.demo.models.Solicitud;

public interface ISolicitudesService {
  public Iterable<Solicitud> buscarTodos();
}
