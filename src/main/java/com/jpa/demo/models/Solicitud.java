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
  private String imagen = "no-image.png";
  private String comentario;

  // @JoinColumn(name = "idSolicitud")
  private Solicitud solicitud;

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
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public String getImagen() {
    return imagen;
  }

  public void setImagen(String imagen) {
    this.imagen = imagen;
  }

  @Override
  public String toString() {
    return "Solicitud [id=" + id + ", fecha=" + fecha + ", comentario=" + comentario + ", fecha=" + fecha + "]";
  }
}