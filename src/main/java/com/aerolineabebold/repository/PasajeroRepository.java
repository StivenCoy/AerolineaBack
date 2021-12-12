package com.aerolineabebold.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aerolineabebold.entity.Pasajero;

@Repository
public interface PasajeroRepository extends JpaRepository<Pasajero, Integer> {

}
