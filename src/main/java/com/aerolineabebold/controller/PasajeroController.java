package com.aerolineabebold.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aerolineabebold.entity.Pasajero;
import com.aerolineabebold.service.PasajeroService;

	@RestController
	@RequestMapping("/api/pasajero")
	@CrossOrigin({"*"})
	public class PasajeroController {
		
		@Autowired
		public PasajeroService pasajeroService;
		 
		/**
		 * Metodo que crea un pasajero 
		 * @param pasajero Pasajero que va hacer creado
		 * @return retorna el pasajero creado
		 */
		@PostMapping("/crear")
		public ResponseEntity<?> create(@RequestBody Pasajero pasajero)
		{
			return ResponseEntity.status(HttpStatus.CREATED).body(pasajeroService.crearPasajero(pasajero));
		}
		
		/**
		 * Metodo que busca un pasajero con su id
		 * @param idpasajero id del pasajero a ser buscado
		 * @return retorna el pasajero 
		 */
		@GetMapping("/buscar/{idpasajero}")
		public ResponseEntity<?> buscar(@PathVariable(value ="idpasajero") Integer idpasajero){
			Optional<Pasajero> mipasajero= pasajeroService.buscarPasajero(idpasajero);
			if(!mipasajero.isPresent()) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(mipasajero);
		}
		
	}
