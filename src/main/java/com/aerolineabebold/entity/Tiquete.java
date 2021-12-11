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
	@Table(name = "tiquete")
	public class Tiquete  implements Serializable{
	
	private static final long serialVersionUID = -4796605244089797675L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name="idtiquete")
	private int idtiquete;
	
	@Column(nullable = false, name="totalpago")
	private double totalpago;
	
	@Column(nullable = false, name="cantidadpersonas")
	private int cantidadpersonas;
	
	@ManyToOne
	@JoinColumn(name = "idpasajero", referencedColumnName = "idpasajero")
	private Pasajero idpasajero;
	
	@ManyToOne
	@JoinColumn(name = "idreserva", referencedColumnName = "idreserva")
	private Reserva idreserva;
	
	@ManyToOne
	@JoinColumn(name = "idvuelo", referencedColumnName = "idvuelo")
	private Vuelo idvuelo;
	
	public int getIdtiquete() {
		return idtiquete;
	}
	
	public void setIdtiquete(int idtiquete) {
		this.idtiquete = idtiquete;
	}
	
	public double getTotalpago() {
		return totalpago;
	}

	public void setTotalpago(double totalpago) {
		this.totalpago = totalpago;
	}

	public int getCantidadpersonas() {
		return cantidadpersonas;
	}

	public void setCantidadpersonas(int cantidadpersonas) {
		this.cantidadpersonas = cantidadpersonas;
	}

	public Pasajero getIdpasajero() {
		return idpasajero;
	}

	public void setIdpasajero(Pasajero idpasajero) {
		this.idpasajero = idpasajero;
	}

	public Vuelo getIdvuelo() {
		return idvuelo;
	}

	public void setIdvuelo(Vuelo idvuelo) {
		this.idvuelo = idvuelo;
	}

	public Reserva getIdreserva() {
		return idreserva;
	}

	public void setIdreserva(Reserva idreserva) {
		this.idreserva = idreserva;
	}
	
	
}
