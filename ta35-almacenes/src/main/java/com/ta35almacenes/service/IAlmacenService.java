package com.ta35almacenes.service;

import java.util.List;

import com.ta35almacenes.dto.Almacenes;

public interface IAlmacenService {
	
	//Metodos CRUD
	
	public List<Almacenes> listarAlmacenes();
	
	public Almacenes buscarAlmacenCodigo(int codigo);

	public Almacenes guardarAlmacen(Almacenes almacen);

	public Almacenes actualizarAlmacen(Almacenes almacen);

	public void eliminarAlmacen(int codigo);

}
