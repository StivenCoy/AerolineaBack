package com.aerolineabebold.service;

import java.util.List;

import com.aerolineabebold.entity.Registro;

public interface RegistroService {

	public List<Object[]> historial(int idpasajero);
	public Registro crearRegistro(Registro vuelo);
	//public Optional<Vuelo> buscarVuelo(int idvuelo);
}
