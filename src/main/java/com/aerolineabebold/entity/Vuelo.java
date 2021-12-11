package com.aerolineabebold.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "vuelo")
@Inheritance(strategy =  InheritanceType.JOINED)
public class Vuelo implements Serializable {

	private static final long serialVersionUID = 87022044608128812L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name="idvuelo")
	private Vuelo idvuelo ;
	
	@Column(nullable = false, name="fecha")
	@DateTimeFormat(pattern="%Y-%m-%d")
	private Date fecha;
	
	@Column(nullable = false, name="escala")
	private Boolean escala;
	
	@Column(nullable = false, name="preciopersona")
	private Double preciopresona;
	
	@Column(nullable = false, name="sillasdisponibles")
	private int sillasdisponibles;
	
	@Column(nullable = false, name="numerovuelo")
	private int numerovuelo;
	
	@Column(nullable = false, name="duracion")
	private String duracion;
	
	@Column(nullable = false, name="hora")
	private String hora;
	
	@ManyToOne
	@JoinColumn(name = "idruta", referencedColumnName = "idruta")
	private Ruta idruta ;

	public Vuelo getIdvuelo() {
		return idvuelo;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void setIdvuelo(Vuelo idvuelo) {
		this.idvuelo = idvuelo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Boolean getEscala() {
		return escala;
	}

	public void setEscala(Boolean escala) {
		this.escala = escala;
	}

	public Double getPreciopresona() {
		return preciopresona;
	}

	public void setPreciopresona(Double preciopresona) {
		this.preciopresona = preciopresona;
	}

	public int getSillasdisponibles() {
		return sillasdisponibles;
	}

	public void setSillasdisponibles(int sillasdisponibles) {
		this.sillasdisponibles = sillasdisponibles;
	}

	public int getNumerovuelo() {
		return numerovuelo;
	}

	public void setNumerovuelo(int numerovuelo) {
		this.numerovuelo = numerovuelo;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Ruta getIdruta() {
		return idruta;
	}

	public void setIdruta(Ruta idruta) {
		this.idruta = idruta;
	}
	
	
	
	
	
}
