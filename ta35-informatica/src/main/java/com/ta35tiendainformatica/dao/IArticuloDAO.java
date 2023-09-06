package com.ta35tiendainformatica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta35tiendainformatica.dto.Articulos;

public interface IArticuloDAO extends JpaRepository<Articulos, Integer> {

}
