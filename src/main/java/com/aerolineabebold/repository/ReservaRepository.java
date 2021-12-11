package com.aerolineabebold.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aerolineabebold.entity.Reserva;


	@Repository
	public interface ReservaRepository  extends JpaRepository<Reserva, Integer>{
		
		@Query(value = "select r.estado,p.idpasajero, co.nombreorigen, v.fecha, v.escala, cd.nombre, p.nombrep, p.apellido from reserva as r inner join vuelo as v on r.idvueloida=v.idvuelo inner join ruta as rut on rut.idruta=v.idruta inner join ciudadorigen as co on co.idciudad=rut.idciudadorig inner join ciudaddestino as cd on cd.idciudaddestino=rut.idciudaddes inner join tiquete as t on r.idreserva=t.idreserva inner join pasajero as p on p.idpasajero=t.idpasajero", nativeQuery=true)
		List<Object[]> listarReservas();
	}
