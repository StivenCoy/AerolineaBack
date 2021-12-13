package com.aerolineabebold.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.aerolineabebold.entity.Vuelo;

public interface VueloService {
		public List<Object[]> ciudadesOrigen(String origen,String destino, Date fecha, int cantidad);
		public List<String> ciudadesVuelta(String ciudadO,String ciudadD, Date fecha);
		public Optional<Vuelo> buscarVuelo(Integer idvuelo);
	}
