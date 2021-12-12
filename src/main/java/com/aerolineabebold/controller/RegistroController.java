package com.aerolineabebold.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public RegistroService registroService;
	
	/**
	 * Metodo que busca el registro de un pasajero dado su id
	 * @param idpasajero id del pasajero al cual se le buscara el registro
	 * @return retorna retorna los datos del registro 
	 */
	@GetMapping("/pasa/{idpasajero}")
	public ResponseEntity<?> buscarD(@PathVariable(value ="idpasajero") int idpasajero){
		List<Object[]> miOptional = registroService.historial(idpasajero);
		if(miOptional.isEmpty()){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(miOptional);
	}
	
	/**
	 * Metodo que crea un registro 
	 * @param registro registro a ser creado
	 * @return retorna el registro creado
	 */
	@PostMapping("/crear")
	public ResponseEntity<?> create(@RequestBody Registro registro)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(registroService.crearRegistro(registro));
	}
	
	/**
	 * Metodo que busca un registro dado su id
	 * @param idRegistro id del registro a buscar 
	 * @return retorna el registro encontrado
	 */
	@GetMapping("/buscar/{idRegistro}")
	public ResponseEntity<?> buscar(@PathVariable(value ="idRegistro") Integer idRegistro){
		Optional<Registro>miregistro=registroService.buscarRegistro(idRegistro);
		if(!miregistro.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(miregistro.get());
	}
	
	/**
	 * Metodo que actualiza un registro dado un registro con los valores a cambiar
	 * @param registroDetalle registro que contiene los cambios
	 * @param idregistro  id del registro a ser actualizado
	 * @return
	 */
	@PutMapping("/actualizar/{idregistro}")
	public ResponseEntity<?> actualizar(@RequestBody Registro registroDetalle,@PathVariable(value="idregistro") Integer idregistro){
		Optional<Registro> miRegistro= registroService.buscarRegistro(idregistro);	
		if(miRegistro == null) {
			return ResponseEntity.notFound().build();
		}
		miRegistro.get().setCantidadmillas(miRegistro.get().getCantidadmillas()+registroDetalle.getCantidadmillas());
		return ResponseEntity.status(HttpStatus.CREATED).body(registroService.crearRegistro(miRegistro.get()));
	}
}
