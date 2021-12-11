package com.aerolineabebold.controller;

import java.util.List;

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

import com.aerolineabebold.entity.Registro;
import com.aerolineabebold.service.RegistroService;

@RestController
@RequestMapping("/api/historial")
@CrossOrigin({"*"})
public class RegistroController {
	@Autowired
	private RegistroService registroService;
	
	@GetMapping("/pasajero/{idpasajero}")
	public ResponseEntity<?> buscarD(@PathVariable(value ="idpasajero") int idpasajero){
		List<Object[]> miOptional = registroService.historial(idpasajero);
		if(miOptional.isEmpty()){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(miOptional);
	}
	@PostMapping("/crear")
	public ResponseEntity<?> create(@RequestBody Registro registro)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(registroService.crearRegistro(registro));
	}
}
