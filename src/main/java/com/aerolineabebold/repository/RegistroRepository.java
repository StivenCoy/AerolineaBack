package com.aerolineabebold.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aerolineabebold.entity.Registro;


	@Repository
	public interface RegistroRepository  extends JpaRepository<Registro, Integer> {
		@Query(value = "select cantidadviajes,cantidadmillas from registro where idpasajero=(:idpasajero)", nativeQuery=true)
		List<Object[]> historial(int idpasajero);
	}
