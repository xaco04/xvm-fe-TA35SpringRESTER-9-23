package com.ta35peliculassalas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta35peliculassalas.dao.ISalaDAO;
import com.ta35peliculassalas.dto.Salas;

@Service
public class SalaServiceImpl implements ISalaService{
	
	@Autowired
	ISalaDAO iSalaDAO;

	@Override
	public List<Salas> listarSalas() {
		
		return iSalaDAO.findAll();
	}

	@Override
	public Salas buscarSalaCodigo(int codigo) {
		
		return iSalaDAO.findById(codigo).get();
	}

	@Override
	public Salas guardarSala(Salas sala) {
		
		return iSalaDAO.save(sala);
	}

	@Override
	public Salas actualizarSala(Salas sala) {
		
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(int codigo) {
		
		iSalaDAO.deleteById(codigo);
	}

}
