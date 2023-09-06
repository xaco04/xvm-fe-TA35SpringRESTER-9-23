package com.ta35empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta35empleados.dto.Empleados;


public interface IEmpleadoDAO extends JpaRepository<Empleados, String> {

}
