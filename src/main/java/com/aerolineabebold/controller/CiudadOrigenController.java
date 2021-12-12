package com.aerolineabebold.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aerolineabebold.service.CiudadOrigenService;

@RestController
@RequestMapping("/api/ciudad")
@CrossOrigin({"*"})
public class CiudadOrigenController {

	@Autowired
	public CiudadOrigenService ciudadOrigenService;
	
	/**
	 * metodo que busca las ciudades origenes
	 * @return retorna los nombres de las ciudades 
	 */
	@GetMapping("/origen")
	public ResponseEntity<?> listarOrigenes(){
		List<String> miOptional = (List<String>)ciudadOrigenService.ciudadesOrigen();
		if(miOptional.isEmpty()){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(miOptional);
	}
}
