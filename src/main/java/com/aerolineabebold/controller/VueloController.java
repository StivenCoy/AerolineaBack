package com.aerolineabebold.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aerolineabebold.entity.Vuelo;
import com.aerolineabebold.service.VueloService;

	@RestController
	@RequestMapping("/api/vuelos")
	@CrossOrigin({"*"})
	public class VueloController {
	
		@Autowired
		private VueloService vueloService;
		
		/**
		 * Metodo que lista los vuelos dado un origen un destino una fecha y la cantidad de viajeros
		 * @param fecha fecha del vuelo
		 * @param origen ciudad origen 
		 * @param destino ciudad destino
		 * @param cantidad cantidad de viajeros
		 * @return retorna una lista con todos los vuelos
		 */
		@GetMapping("/destinos/")
		public ResponseEntity<?> buscarV(
				@RequestParam(value="fecha") @DateTimeFormat( pattern ="yyyy-MM-dd" ) Date fecha,
				@RequestParam(value="origen", required = false) String origen,
				@RequestParam(value="destino",required = false) String destino,
				@RequestParam(value="cantidad",required = false) int cantidad){
			System.out.println(origen+ " "+ destino+" "+ fecha+" "+ cantidad );
			List<Object[]> miOptional = vueloService.ciudadesOrigen(origen, destino, fecha, cantidad);
			if(miOptional.isEmpty()){
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(miOptional);
		}
		
		@GetMapping("/buscar/{idvuelo}")
		public ResponseEntity<?> buscar(@PathVariable(value ="idvuelo") Integer idvuelo){
			Optional<Vuelo> miOptional = vueloService.buscarVuelo(idvuelo);
			if(!miOptional.isPresent()) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(miOptional);
		}
		
	}
