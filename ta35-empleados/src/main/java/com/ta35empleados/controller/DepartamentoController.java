package com.ta35empleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ta35empleados.dto.Departamentos;
import com.ta35empleados.service.DepartamentoServiceImpl;

public class DepartamentoController {
	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamentos> listarDepartamentos() {
		
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	@GetMapping("/departamentos/{codigo}")
	public Departamentos buscarDepartamentoPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return departamentoServiceImpl.buscarDepartamentoCodigo(codigo);
	}
	
	@PostMapping("/departamentos")
	public Departamentos guardarDepartamento(@RequestBody Departamentos departamento) {
		
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}
	
	@PutMapping("/departamentos/{codigo}")
	public Departamentos actualizarDepartamento(@PathVariable(name = "codigo") int codigo, @RequestBody Departamentos departamento) {
		
		Departamentos departamentoSeleccionado = new Departamentos();
		Departamentos departamentoActualizado = new Departamentos();
		
		departamentoSeleccionado = departamentoServiceImpl.buscarDepartamentoCodigo(codigo);
		
		departamentoSeleccionado.setNombre(departamento.getNombre());
		departamentoSeleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamentoActualizado = departamentoServiceImpl.actualizarDepartamento(departamentoSeleccionado);
		
		return departamentoActualizado;
	}
	
	@DeleteMapping("/departamentos/{codigo}")
	public void eliminarDepartamento(@PathVariable(name = "codigo") int codigo) {
		
		departamentoServiceImpl.eliminarDepartamento(codigo);
	}

}
