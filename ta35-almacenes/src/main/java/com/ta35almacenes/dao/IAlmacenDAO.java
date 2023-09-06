package com.ta35almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta35almacenes.dto.Almacenes;

public interface IAlmacenDAO extends JpaRepository<Almacenes, Integer>{

}
