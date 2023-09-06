package com.ta35peliculassalas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ta35peliculassalas.dto.Salas;
import com.ta35peliculassalas.service.SalaServiceImpl;

@RestController
public class SalaController {
	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	@GetMapping("/salas")
	public List<Salas> listarSalas() {
		
		return salaServiceImpl.listarSalas();
	}
	
	@GetMapping("/salas/{codigo}")
	public Salas buscarSalaPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return salaServiceImpl.buscarSalaCodigo(codigo);
	}
	
	@PostMapping("/salas")
	public Salas guardarSala(@RequestBody Salas sala) {
		
		return salaServiceImpl.guardarSala(sala);
	}
	
	@PutMapping("/salas/{codigo}")
	public Salas actualizarSala(@PathVariable(name = "codigo") int codigo, @RequestBody Salas sala) {
		
		Salas salaSeleccionada = new Salas();
		Salas salaActualizada = new Salas();
		
		salaSeleccionada = salaServiceImpl.buscarSalaCodigo(codigo);
		
		salaSeleccionada.setNombre(sala.getNombre());
		salaSeleccionada.setPelicula(sala.getPelicula());
		
		salaActualizada = salaServiceImpl.actualizarSala(salaSeleccionada);
		
		return salaActualizada;
	}
	
	@DeleteMapping("/salas/{codigo}")
	public void eliminarSala(@PathVariable(name = "codigo") int codigo) {
		
		salaServiceImpl.eliminarSala(codigo);
	}


}
