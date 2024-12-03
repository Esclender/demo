package com.jpa.demo.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "solicitudes")
public class Solicitud {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private Date fecha;
  private String archivo = "no-image.png";
  private String comentarios;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getComentario() {
    return comentarios;
  }

  public void setComentario(String comentario) {
    this.comentarios = comentario;
  }

  public String getImagen() {
    return archivo;
  }

  public void setImagen(String archivo) {
    this.archivo = archivo;
  }

  @Override
  public String toString() {
    return "Solicitud [id=" + id + ", fecha=" + fecha + ", comentario=" + comentarios + ", fecha=" + fecha + "]";
  }
}