package com.aerolineabebold.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aerolineabebold.entity.Reserva;
import com.aerolineabebold.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	public ReservaRepository repository;
	
	@Override
	public List<Object[]> listarReservas() {
		return repository.listarReservas();
	}

	@Override
	public Reserva crearRegistro(Reserva reserva) {
		return repository.save(reserva);
	}
}
