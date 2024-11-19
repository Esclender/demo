package com.jpa.demo.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vacantes")
public class Vacante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nombre;
	private String descripcion;
	private Date fecha;
	private double salario;
	private Integer destacado; // si tiene el valor 1 es destacado, si tiene 0 no lo es

	// nuevo atributo, para gestionar las imagenes de cada vacante
	private String imagen = "no-image.png";
	private String estatus;
	private String detalles;

	@ManyToOne
	@JoinColumn(name = "idCategoria")
	private Categoria categoria;

	public String getDetalle() {
		return detalles;
	}

	public void setDetalle(String detalle) {
		this.detalles = detalle;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Integer getDestacado() {
		return destacado;
	}

	public void setDestacado(Integer destacado) {
		this.destacado = destacado;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Vacante [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", salario=" + salario + ", destacado=" + destacado + ", imagen=" + imagen + ", detalles=" + detalles
				+ ", estatus=" + estatus + "]";
	}
}