package com.ta35empleados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta35empleados.dao.IEmpleadoDAO;
import com.ta35empleados.dto.Empleados;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;

	@Override
	public List<Empleados> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleados buscarEmpleadoDni(String dni) {
		
		return iEmpleadoDAO.findById(dni).get();
	}
	
	@Override
	public Empleados actualizarEmpleado(Empleados empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}
	
	@Override
	public Empleados guardarEmpleado(Empleados empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}


	@Override
	public void eliminarEmpleado(String dni) {
		
		iEmpleadoDAO.deleteById(dni);
	}


}
