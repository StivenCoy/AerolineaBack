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
@Table(name = "registro")
public class Registro implements Serializable {

	private static final long serialVersionUID = -6993785093833729466L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name="idregistro")
	private int idregistro;
	
	@Column(nullable = false, name="cantidadmillas")
	private double cantidadmillas;
	
	@ManyToOne
	@JoinColumn(name = "idpasajero", referencedColumnName = "idpasajero")
	private Pasajero idpasajero;

	public int getIdregistro() {
		return idregistro;
	}

	public void setIdregistro(int idregistro) {
		this.idregistro = idregistro;
	}

	public double getCantidadmillas() {
		return cantidadmillas;
	}

	public void setCantidadmillas(double cantidadmillas) {
		this.cantidadmillas = cantidadmillas;
	}

	public Pasajero getIdpasajero() {
		return idpasajero;
	}

	public void setIdpasajero(Pasajero idpasajero) {
		this.idpasajero = idpasajero;
	}
	
	
	
}
