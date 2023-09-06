package com.ta35almacenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ta35almacenes.dto.Almacenes;
import com.ta35almacenes.service.AlmacenServiceImpl;

@RestController
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes() {
		
		return almacenServiceImpl.listarAlmacenes();
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacenes buscarAlmacenPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return almacenServiceImpl.buscarAlmacenCodigo(codigo);
	}
	
	@PostMapping("/almacenes")
	public Almacenes guardarAlmacen(@RequestBody Almacenes almacen) {
		
		return almacenServiceImpl.guardarAlmacen(almacen);
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacenes actualizarAlmacen(@PathVariable(name = "codigo") int codigo, @RequestBody Almacenes almacen) {
		
		Almacenes almacenSeleccionado = new Almacenes();
		Almacenes almacenActualizado = new Almacenes();
		
		almacenSeleccionado = almacenServiceImpl.buscarAlmacenCodigo(codigo);
		
		almacenSeleccionado.setLugar(almacen.getLugar());
		almacenSeleccionado.setCapacidad(almacen.getCapacidad());
		
		almacenActualizado = almacenServiceImpl.actualizarAlmacen(almacenSeleccionado);
		
		return almacenActualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacen(@PathVariable(name = "codigo") int codigo) {
		
		almacenServiceImpl.eliminarAlmacen(codigo);
	}

}
