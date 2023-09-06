package com.ta35empleados.service;

import java.util.List;

import com.ta35empleados.dto.Empleados;

public interface IEmpleadoService {
	
	public List<Empleados> listarEmpleados();

	public Empleados buscarEmpleadoDni(String dni);
	
	public Empleados actualizarEmpleado(Empleados empleado);

	public Empleados guardarEmpleado(Empleados empleado);

	public void eliminarEmpleado(String dni);

}
