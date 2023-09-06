package com.ta35peliculassalas.service;

import java.util.List;

import com.ta35peliculassalas.dto.Salas;

public interface ISalaService {
	
	public List<Salas> listarSalas();

	public Salas buscarSalaCodigo(int codigo);

	public Salas guardarSala(Salas sala);

	public Salas actualizarSala(Salas sala);

	public void eliminarSala(int codigo);

}
