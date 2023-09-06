package com.ta35tiendainformatica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ta35tiendainformatica.dto.Fabricantes;
import com.ta35tiendainformatica.service.IFabricanteServiceImpl;

@RestController
public class FabricanteController {
	@Autowired
	IFabricanteServiceImpl ifabricanteServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricantes> listarFabricantes() {
		
		return ifabricanteServiceImpl.listarFabricantes();
	}
	
	@GetMapping("/fabricantes/{codigo}")
	public Fabricantes buscarFabricantePorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return ifabricanteServiceImpl.buscarFabricanteCodigo(codigo);
	}
	
	@PostMapping("/fabricantes")
	public Fabricantes guardarFabricante(@RequestBody Fabricantes fabricante) {
		
		return ifabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	@PutMapping("/fabricantes/{codigo}")
	public Fabricantes actualizarFabricante(@PathVariable(name = "codigo") int codigo, @RequestBody Fabricantes fabricante) {
		
		Fabricantes fabricanteSeleccionado = new Fabricantes();
		Fabricantes fabricanteActualizado = new Fabricantes();
		
		fabricanteSeleccionado = ifabricanteServiceImpl.buscarFabricanteCodigo(codigo);
		
		fabricanteSeleccionado.setNombre(fabricante.getNombre());
		
		fabricanteActualizado = ifabricanteServiceImpl.actualizarFabricante(fabricanteSeleccionado);
		
		return fabricanteActualizado;
	}
	
	@DeleteMapping("/fabricantes/{codigo}")
	public void eliminarFabricante(@PathVariable(name = "codigo") int codigo) {
		
		ifabricanteServiceImpl.eliminarFabricante(codigo);
	}


}
