package com.ta35empleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ta35empleados.dto.Empleados;
import com.ta35empleados.service.EmpleadoServiceImpl;

public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;

	@GetMapping("/empleados")
	public List<Empleados> listarEmpleados() {

		return empleadoServiceImpl.listarEmpleados();
	}

	@GetMapping("/empleados/{dni}")
	public Empleados buscarEmpleadoPorDni(@PathVariable(name = "dni") String dni) {

		return empleadoServiceImpl.buscarEmpleadoDni(dni);
	}

	@PostMapping("/empleados")
	public Empleados guardarEmpleado(@RequestBody Empleados empleado) {

		return empleadoServiceImpl.guardarEmpleado(empleado);
	}

	@PutMapping("/empleados/{dni}")
	public Empleados actualizarEmpleado(@PathVariable(name = "dni") String dni, @RequestBody Empleados empleado) {

		Empleados empleadoSeleccionado = new Empleados();
		Empleados empleadoActualizado = new Empleados();

		empleadoSeleccionado = empleadoServiceImpl.buscarEmpleadoDni(dni);

		empleadoSeleccionado.setNombre(empleado.getNombre());
		empleadoSeleccionado.setApellidos(empleado.getApellidos());
		empleadoSeleccionado.setDepartamento(empleado.getDepartamento());

		empleadoActualizado = empleadoServiceImpl.actualizarEmpleado(empleadoSeleccionado);

		return empleadoActualizado;
	}

	@DeleteMapping("/empleados/{dni}")
	public void eliminarEmpleado(@PathVariable(name = "dni") String dni) {

		empleadoServiceImpl.eliminarEmpleado(dni);
	}

}
