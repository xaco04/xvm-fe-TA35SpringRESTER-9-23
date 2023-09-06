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

import com.ta35almacenes.dto.Cajas;
import com.ta35almacenes.service.CajaServiceImpl;

@RestController
public class CajaController {
	@Autowired
	CajaServiceImpl cajaServiceImpl;
	
	@GetMapping("/cajas")
	public List<Cajas> listarCajas() {
		
		return cajaServiceImpl.listarCajas();
	}
	
	@GetMapping("/cajas/{numReferencia}")
	public Cajas buscarCajaPorNumReferencia(@PathVariable(name = "numReferencia") String numReferencia) {
		
		return cajaServiceImpl.buscarCajaNReferencia(numReferencia);
	}
	
	@PostMapping("/cajas")
	public Cajas guardarCaja(@RequestBody Cajas caja) {
		
		return cajaServiceImpl.guardarCaja(caja);
	}
	
	@PutMapping("/cajas/{numReferencia}")
	public Cajas actualizarCaja(@PathVariable(name = "numReferencia") String numReferencia, @RequestBody Cajas caja) {
		
		Cajas cajaSeleccionada = new Cajas();
		Cajas cajaActualizada = new Cajas();
		
		cajaSeleccionada = cajaServiceImpl.buscarCajaNReferencia(numReferencia);
		
		cajaSeleccionada.setContenido(caja.getContenido());
		cajaSeleccionada.setValor(caja.getValor());
		cajaSeleccionada.setAlmacen(caja.getAlmacen());
		
		cajaActualizada = cajaServiceImpl.actualizarCaja(cajaSeleccionada);
		
		return cajaActualizada;
	}
	
	@DeleteMapping("/cajas/{numReferencia}")
	public void eliminarAlmacen(@PathVariable(name = "numReferencia") String numReferencia) {
		
		cajaServiceImpl.eliminarCaja(numReferencia);
	}



}
