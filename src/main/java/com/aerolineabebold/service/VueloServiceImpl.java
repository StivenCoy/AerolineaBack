package com.aerolineabebold.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aerolineabebold.entity.Vuelo;
import com.aerolineabebold.repository.VueloRepository;

@Service
public class VueloServiceImpl implements VueloService {

	@Autowired
	private VueloRepository vueloRepository;
	
	@Override
	public List<Object[]> ciudadesOrigen(String origen, String destino, Date fecha,int cantidad) {
		return vueloRepository.ciudadesOrigen(origen, destino, fecha,cantidad);
		 
	}

	@Override
	public List<String> ciudadesVuelta(String ciudadO, String ciudadD, Date fecha) {
		return vueloRepository.ciudadesVuelta(ciudadO, ciudadD, fecha);
	}

	@Override
	public Optional<Vuelo> buscarVuelo(Integer idvuelo) {
		return vueloRepository.findById(idvuelo);
	}

}
