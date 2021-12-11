package com.aerolineabebold.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadorigen")
@Inheritance(strategy = InheritanceType.JOINED)
public class CiudadOrigen implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8431519019787129517L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name="idciudad")
	private int idciudad;
	
	
	@Column(nullable = false, name="nombreorigen")
	private String nombreorigen;


	public int getIdciudad() {
		return idciudad;
	}


	public void setIdciudad(int idciudad) {
		this.idciudad = idciudad;
	}


	public String getNombre() {
		return nombreorigen;
	}


	public void setNombre(String nombreorigen) {
		this.nombreorigen = nombreorigen;
	}
	
	
}
