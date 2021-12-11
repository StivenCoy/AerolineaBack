package com.aerolineabebold.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aerolineabebold.entity.Vuelo;

	@Repository
	public interface VueloRepository extends JpaRepository<Vuelo, Integer> {
		
			
				@Query(value = "select fecha, duracion, escala, preciopersona,idvuelo  from vuelo as v inner join ruta as r on r.idruta = v.idruta inner join ciudadorigen as c on r.idciudadorig = c.idciudad  inner join ciudaddestino as cd on cd.idciudaddestino = r.idciudaddes where c.nombre=(:origen) and cd.nombre=(:destino) and v.fecha=(:fecha) and sillasdisponibles > (:cantidad)", nativeQuery=true)
				List<Object[]> ciudadesOrigen(String origen,String destino, Date fecha,int cantidad);
				
				
				
				@Query(value = "select fecha, duracion, escala, preciopersona  from aerolinea.vuelo as v inner join ruta as r on r.idruta = v.idruta inner join ciudadorigen as c on r.idciudadorig = c.idciudad  inner join ciudaddestino as cd on cd.idciudaddestino = r.idciudaddes where c.nombre=(:ciudadD) and cd.nombre=(:ciudadO) and v.fecha=(:fecha) and sillasdisponibles > 0", nativeQuery=true)
				List<String> ciudadesVuelta(String ciudadO,String ciudadD, Date fecha);
	
	}
