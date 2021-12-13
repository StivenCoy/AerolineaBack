package com.aerolineabebold.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.aerolineabebold.entity.Registro;
import com.aerolineabebold.repository.RegistroRepository;

@Service
public class RegistroServiceImpl implements RegistroService {
	
	@Autowired
	public RegistroRepository registroRepository;

	@Override
	public List<Object[]> historial(int idpasajero) {
		return registroRepository.historial(idpasajero);
	}
	@Override
	@Transactional
	public Registro crearRegistro(Registro repositorio) {
		return registroRepository.save(repositorio);
	}
//	@Override
//	@Transactional
//	public Optional<Registro> buscarVuelo(int idregistro) {
//		
//		return registroRepository.findById(idregistro);
//	}
	@Override
	public Optional<Registro> buscarRegistro(int idregistro) {
		return registroRepository.findById(idregistro);
	}
}
