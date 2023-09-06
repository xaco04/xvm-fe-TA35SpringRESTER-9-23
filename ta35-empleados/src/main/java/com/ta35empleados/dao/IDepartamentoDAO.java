package com.ta35empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta35empleados.dto.Departamentos;

public interface IDepartamentoDAO extends JpaRepository<Departamentos, Integer>{

}
