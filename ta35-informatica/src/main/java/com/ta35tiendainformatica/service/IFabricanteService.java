package com.ta35tiendainformatica.service;

import java.util.List;

import com.ta35tiendainformatica.dto.Fabricantes;

public interface IFabricanteService {
	
	//Metodos CRUD
	
	public List<Fabricantes> listarFabricantes();
	
	public Fabricantes buscarFabricanteCodigo(int codigo);
	
	public Fabricantes actualizarFabricante(Fabricantes fabricante);
	
	public Fabricantes guardarFabricante(Fabricantes fabricante);
	
	public void eliminarFabricante(int codigo);
	
	

}
