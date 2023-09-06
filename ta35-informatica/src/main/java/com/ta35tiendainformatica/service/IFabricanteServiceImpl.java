package com.ta35tiendainformatica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta35tiendainformatica.dao.IFabricanteDAO;
import com.ta35tiendainformatica.dto.Fabricantes;

@Service
public class IFabricanteServiceImpl implements IFabricanteService {

	@Autowired
	IFabricanteDAO iFabricanteDAO;

	@Override
	public List<Fabricantes> listarFabricantes() {
		
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricantes buscarFabricanteCodigo(int codigo) {
		
		return iFabricanteDAO.findById(codigo).get();
	}

	@Override
	public Fabricantes guardarFabricante(Fabricantes fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricantes actualizarFabricante(Fabricantes fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(int codigo) {
		
		iFabricanteDAO.deleteById(codigo);
	}

}
