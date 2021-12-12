package com.aerolineabebold.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.aerolineabebold.service.RutaService;

	@RestController
	@RequestMapping("/api/ruta")
	@CrossOrigin({"*"})
	public class RutaController {
	
		@Autowired
		private RutaService rutaService;
		
		/**
		 * Metodo que lista los nombres de los destinos dado un origen
		 * @param nombre nombre de la ciudad origen 
		 * @return retorna la lista con los nombres de los destinos
		 */
		@GetMapping("/destinos/{nombre}")
		public ResponseEntity<?> buscarD(@PathVariable(value ="nombre") String nombre){
			List<String> miOptional = rutaService.ciudadesDestino(nombre);
			if(miOptional.isEmpty()){
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(miOptional);
		}
		}
