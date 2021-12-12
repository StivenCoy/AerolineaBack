package com.aerolineabebold.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aerolineabebold.entity.Tiquete;
import com.aerolineabebold.service.TiqueteService;

	@RestController
	@RequestMapping("/api/tiquete")
	@CrossOrigin({"*"})
	public class TiqueteController {
		
		@Autowired
		public TiqueteService tiqueteService;
	
		/**
		 * Metodo que crea un tiquete 
		 * @param tiquete tiquete que se va a crear 
		 * @return retorna el tiquete creado
		 */
		@PostMapping("/crear")
		public ResponseEntity<?> create(@RequestBody Tiquete tiquete)
		{
			return ResponseEntity.status(HttpStatus.CREATED).body(tiqueteService.crearTiquete(tiquete));
		}
	}
