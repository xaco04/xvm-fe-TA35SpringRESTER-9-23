package com.ta35peliculassalas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta35peliculassalas.dto.Salas;

public interface ISalaDAO extends JpaRepository<Salas, Integer>{
	
}
