package com.aerolineabebold.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ruta")
public class Ruta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6864101984544054963L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name="idruta")
	private int idruta;
	
	@ManyToOne
	@JoinColumn(name = "idciudadorig", referencedColumnName = "idciudad")
	private CiudadOrigen idciudadorig;
	
	@ManyToOne
	@JoinColumn(name = "idciudaddes", referencedColumnName = "idciudaddestino")
	private CiudadDestino idciudaddes;

	public int getIdruta() {
		return idruta;
	}

	public void setIdruta(int idruta) {
		this.idruta = idruta;
	}

	public CiudadOrigen getIdciudadorig() {
		return idciudadorig;
	}

	public void setIdciudadorig(CiudadOrigen idciudadorig) {
		this.idciudadorig = idciudadorig;
	}

	public CiudadDestino getIdciudaddes() {
		return idciudaddes;
	}

	public void setIdciudaddes(CiudadDestino idciudaddes) {
		this.idciudaddes = idciudaddes;
	}
	
	
	
}
