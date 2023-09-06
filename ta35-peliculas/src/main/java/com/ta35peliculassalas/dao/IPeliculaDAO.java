package com.ta35peliculassalas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta35peliculassalas.dto.Peliculas;

public interface IPeliculaDAO extends JpaRepository<Peliculas, Integer> {

}
