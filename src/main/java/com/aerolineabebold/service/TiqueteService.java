package com.aerolineabebold.service;

import org.springframework.stereotype.Service;

import com.aerolineabebold.entity.Tiquete;

@Service
public interface TiqueteService {

	public Tiquete crearTiquete(Tiquete tiquete);
}
