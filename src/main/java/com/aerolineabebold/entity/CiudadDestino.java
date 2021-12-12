package com.aerolineabebold.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ciudaddestino")
public class CiudadDestino implements Serializable {

	private static final long serialVersionUID = 5519812134375793353L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name="idciudaddestino")
	private int idciudaddestino;
	
	@Column(nullable = false, name="nombre")
	private String nombre;

	@Column(name="visa")
	private String visa;

	public int getIdciudaddestino() {
		return idciudaddestino;
	}

	public void setIdciudaddestino(int idciudaddestino) {
		this.idciudaddestino = idciudaddestino;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String isVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}
	
	
}
