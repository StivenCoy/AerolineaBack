package com.aerolineabebold.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aerolineabebold.entity.CiudadOrigen;

@Repository
public interface CiudadOrigenRepository extends JpaRepository<CiudadOrigen, Integer>{

	@Query(value = "select nombreorigen from ciudadorigen", nativeQuery=true)
	List<String> ciudadesOrigen();
}
