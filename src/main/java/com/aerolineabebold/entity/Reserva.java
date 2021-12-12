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

import org.hibernate.annotations.ManyToAny;

	@Entity
	@Table(name = "reserva")
	public class Reserva implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 742544134767197245L;
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(nullable = false, name="idreserva")
		private int idreserva;
		
		@Column(nullable = false, name="estado")
		private String estado;
		
		
		@ManyToOne
		@JoinColumn(name = "idvueloida", referencedColumnName = "idvuelo")
		private Vuelo idvueloida;
		
		@ManyToOne
		@JoinColumn(name = "idvuelovuelta", referencedColumnName = "idvuelo")
		private Vuelo idvuelovuelta;

		public int getIdreserva() {
			return idreserva;
		}

		public void setIdreserva(int idreserva) {
			this.idreserva = idreserva;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public Vuelo getIdvueloida() {
			return idvueloida;
		}

		public void setIdvueloida(Vuelo idvueloida) {
			this.idvueloida = idvueloida;
		}

		public Vuelo getIdvuelovuelta() {
			return idvuelovuelta;
		}

		public void setIdvuelovuelta(Vuelo idvuelovuelta) {
			this.idvuelovuelta = idvuelovuelta;
		}

		
		
	}
