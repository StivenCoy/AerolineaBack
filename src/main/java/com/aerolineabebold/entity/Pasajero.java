package com.aerolineabebold.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pasajero")
public class Pasajero implements Serializable{

	private static final long serialVersionUID = 1039264672627815777L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name="idpasajero")
	private int idpasajero;
	
	@Column(nullable = false, name="nombrep")
	private String nombrep;
	
	@Column(nullable = false, name="apellido")
	private String apellido;
	
	@Column(nullable = false, name="telefono")
	private String telefono;
	
	@Column(nullable = false, name="correo")
	private String correo;
	
	@Column(nullable = false, name="edad")
	private double edad;
	
	@Column(nullable = false, name="fechavisa")
	private Date fechavisa;

	public int getIdpasajero() {
		return idpasajero;
	}

	public void setIdpasajero(int idpasajero) {
		this.idpasajero = idpasajero;
	}

	public String getNombre() {
		return nombrep;
	}

	public void setNombre(String nombre) {
		this.nombrep = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	public Date getFechavisa() {
		return fechavisa;
	}

	public void setFechavisa(Date fechavisa) {
		this.fechavisa = fechavisa;
	}
	
	
}
