package com.aerolineabebold.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aerolineabebold.entity.Pasajero;
import com.aerolineabebold.repository.PasajeroRepository;

@Service
public class PasajeroServiceImpl  implements PasajeroService{

	@Autowired
	public PasajeroRepository pasajeroRepository;
	
	@Override
	@Transactional
	public Pasajero crearPasajero(Pasajero pasajero) {
		return pasajeroRepository.save(pasajero);
	}

	@Override
	@Transactional
	public Optional<Pasajero> buscarPasajero(Integer idpasajero) {
		return pasajeroRepository.findById(idpasajero);
	}
}
