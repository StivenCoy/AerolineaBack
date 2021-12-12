package com.aerolineabebold.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aerolineabebold.entity.Tiquete;
import com.aerolineabebold.repository.TiqueteRepository;

@Service
public class TiqueteServiceImpl implements TiqueteService {

	@Autowired
	public TiqueteRepository tiqueteRepository;
	
	@Transactional
	@Override
	public Tiquete crearTiquete(Tiquete tiquete) {
		return tiqueteRepository.save(tiquete);
	}

}
