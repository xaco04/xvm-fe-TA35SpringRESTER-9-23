package com.ta35peliculassalas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta35peliculassalas.dao.IPeliculaDAO;
import com.ta35peliculassalas.dto.Peliculas;

@Service
public class PeliculaServiceImpl implements IPeliculaService{
	
	@Autowired
	IPeliculaDAO iPeliculaDAO;

	@Override
	public List<Peliculas> listarPeliculas() {
		
		return iPeliculaDAO.findAll();
	}

	@Override
	public Peliculas buscarPeliculaCodigo(int codigo) {
		
		return iPeliculaDAO.findById(codigo).get();
	}

	@Override
	public Peliculas guardarPelicula(Peliculas pelicula) {
		
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Peliculas actualizarPelicula(Peliculas pelicula) {
		
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(int codigo) {
		
		iPeliculaDAO.deleteById(codigo);
	}

}
