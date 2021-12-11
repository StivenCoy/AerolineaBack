package com.aerolineabebold.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aerolineabebold.service.ReservaService;

@RestController
@RequestMapping("/api/reserva")
@CrossOrigin({"*"})
public class ReservaController  {

	@Autowired
	public ReservaService reservaService;
	
	@GetMapping("/listar")
	public ResponseEntity<?> buscarO(){
		List<Object[]> miOptional = reservaService.listarReservas();
		if(miOptional.isEmpty()){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(miOptional);
	}
	
}
