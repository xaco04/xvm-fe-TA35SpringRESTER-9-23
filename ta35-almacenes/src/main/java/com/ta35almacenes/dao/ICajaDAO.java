package com.ta35almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta35almacenes.dto.Cajas;

public interface ICajaDAO extends JpaRepository<Cajas, String> {

}
