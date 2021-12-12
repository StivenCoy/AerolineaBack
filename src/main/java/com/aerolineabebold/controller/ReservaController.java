package com.aerolineabebold.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aerolineabebold.entity.Reserva;
import com.aerolineabebold.service.ReservaService;

@RestController
@RequestMapping("/api/reserva")
@CrossOrigin({"*"})
public class ReservaController  {

	@Autowired
	public ReservaService reservaService;
	
	/**
	 * Metodo que lista las reservas con los datos de Pasajero, Origen,Fecha Ida Si el vuelo es directo o con escalas,
	 * Destino,Fecha regreso,Si el vuelo es directo o con escalas, Nombre, apellido 
	 * @return retorna la lista con los datos anteriores
	 */
	@GetMapping("/listar")
	public ResponseEntity<?> buscarO(){
		List<Object[]> miOptional = reservaService.listarReservas();
		if(miOptional.isEmpty()){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(miOptional);
	}
	
	/**
	 * Metodo que crea una reserva Dada la reserva 
	 * @param reserva Reserva que se va a crear 
	 * @return retorna la reserva creada
	 */
	@PostMapping("/crear")
	public ResponseEntity<?> create(@RequestBody Reserva reserva)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(reservaService.crearRegistro(reserva));
	}
	
}
