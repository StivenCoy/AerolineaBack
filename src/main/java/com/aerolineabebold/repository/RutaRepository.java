package com.aerolineabebold.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aerolineabebold.entity.Ruta;

	@Repository
	public interface RutaRepository extends JpaRepository<Ruta, Integer> {
		
		@Query(value = "select cd.nombre from ciudadorigen as co inner join ruta as r on r.idciudadorig=co.idciudad inner join ciudaddestino as cd on cd.idciudaddestino = r.idciudaddes where co.nombre = (:nombre)",nativeQuery=true)
		        List<String> ciudadesDestino(String nombre);
	}
