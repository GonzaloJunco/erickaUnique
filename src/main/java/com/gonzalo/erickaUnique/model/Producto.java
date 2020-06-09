package com.gonzalo.erickaUnique.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String nombre;
	
	private String contenido;
	
	private Integer precio;
	
	private int cantidad;
	
	

	public Producto() {
		
	}

	public Producto(int codigo, String nombre, String contenido, Integer precio, int cantidad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.contenido = contenido;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	

}
