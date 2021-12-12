package com.aerolineabebold.service;

import java.util.Optional;

import com.aerolineabebold.entity.Pasajero;

public interface PasajeroService {
	
	public Pasajero crearPasajero(Pasajero pasajero);
	public Optional<Pasajero> buscarPasajero(Integer idpasajero);

}
