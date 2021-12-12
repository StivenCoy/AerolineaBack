package com.aerolineabebold.service;

import java.util.List;

import com.aerolineabebold.entity.Reserva;

public interface ReservaService {

	public List<Object[]> listarReservas();
	public Reserva crearRegistro(Reserva reserva);
}
