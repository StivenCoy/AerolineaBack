package com.aerolineabebold.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aerolineabebold.repository.RutaRepository;

@Service
public class RutaServiceImpl implements RutaService{

	@Autowired
	public RutaRepository rutaRepository;

	@Override
	public List<String> ciudadesDestino(String nombre){
		return rutaRepository.ciudadesDestino(nombre);
	}

}
