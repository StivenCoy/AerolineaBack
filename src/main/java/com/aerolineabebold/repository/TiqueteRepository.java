package com.aerolineabebold.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aerolineabebold.entity.Tiquete;

@Repository
public interface TiqueteRepository  extends JpaRepository<Tiquete, Integer> {

}
