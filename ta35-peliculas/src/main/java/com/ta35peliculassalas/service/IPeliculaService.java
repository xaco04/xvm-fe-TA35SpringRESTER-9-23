package com.ta35peliculassalas.service;

import java.util.List;

import com.ta35peliculassalas.dto.Peliculas;

public interface IPeliculaService {
	
	public List<Peliculas> listarPeliculas();

	public Peliculas buscarPeliculaCodigo(int codigo);

	public Peliculas guardarPelicula(Peliculas pelicula);

	public Peliculas actualizarPelicula(Peliculas pelicula);

	public void eliminarPelicula(int codigo);

}
