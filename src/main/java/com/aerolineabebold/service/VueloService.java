package com.aerolineabebold.service;

import java.util.Date;
import java.util.List;

public interface VueloService {
		public List<Object[]> ciudadesOrigen(String origen,String destino, Date fecha, int cantidad);
		public List<String> ciudadesVuelta(String ciudadO,String ciudadD, Date fecha);
	}
