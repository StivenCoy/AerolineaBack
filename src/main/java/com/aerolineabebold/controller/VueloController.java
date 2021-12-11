package com.aerolineabebold.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.aerolineabebold.service.VueloService;

	@RestController
	@RequestMapping("/api/vuelos")
	@CrossOrigin({"*"})
	public class VueloController {
	
		@Autowired
		private VueloService vueloService;
		//@DateTimeFormat(pattern="yyyy-mm-dd")
		@GetMapping("/destinosO")
		public ResponseEntity<?> buscarV(
				@RequestParam(value="fecha")  String fecha,
				@RequestParam(value="origen", required = false) String origen,
				@RequestParam(value="destino",required = false) String destino,
				@RequestParam(value="cantidad",required = false) int cantidad){
			Date fe=null;
			System.out.println(fecha);
			try {
				System.out.println("hola");
				SimpleDateFormat fes= new SimpleDateFormat("yyyy-MM-dd");
				fe=fes.parse(fecha);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(fe);
			List<Object[]> miOptional = vueloService.ciudadesOrigen(origen, destino, fe, cantidad);
			if(miOptional.isEmpty()){
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(miOptional);
		}
		
	}
