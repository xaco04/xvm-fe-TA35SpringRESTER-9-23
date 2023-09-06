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

import com.ta35peliculassalas.dto.Peliculas;
import com.ta35peliculassalas.service.PeliculaServiceImpl;

@RestController
public class PeliculaController {
	
	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listarPeliculas() {
		
		return peliculaServiceImpl.listarPeliculas();
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Peliculas buscarPeliculaPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return peliculaServiceImpl.buscarPeliculaCodigo(codigo);
	}
	
	@PostMapping("/peliculas")
	public Peliculas guardarPelicula(@RequestBody Peliculas pelicula) {
		
		return peliculaServiceImpl.guardarPelicula(pelicula);
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Peliculas actualizarPelicula(@PathVariable(name = "codigo") int codigo, @RequestBody Peliculas pelicula) {
		
		Peliculas peliculaSeleccionada = new Peliculas();
		Peliculas peliculaActualizada = new Peliculas();
		
		peliculaSeleccionada = peliculaServiceImpl.buscarPeliculaCodigo(codigo);
		
		peliculaSeleccionada.setNombre(pelicula.getNombre());
		peliculaSeleccionada.setCalificacionEdad(pelicula.getCalificacionEdad());
		
		peliculaActualizada = peliculaServiceImpl.actualizarPelicula(peliculaSeleccionada);
		
		return peliculaActualizada;
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPelicula(@PathVariable(name = "codigo") int codigo) {
		
		peliculaServiceImpl.eliminarPelicula(codigo);
	}



}
