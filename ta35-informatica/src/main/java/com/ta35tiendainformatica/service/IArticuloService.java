package com.ta35tiendainformatica.service;

import java.util.List;

import com.ta35tiendainformatica.dto.Articulos;

public interface IArticuloService {
	
	//Metodos del CRUD
	
	public List<Articulos> listarArticulos(); //Listar todos
	
	public Articulos buscarArticuloCodigo(int codigo); //Buscar articulo por codigo
	
	public Articulos guardarArticulo(Articulos articulo); //Guardar articulo
	
	public Articulos actualizarArticulo(Articulos articulo); //Actualizar articulo
	
	public void eliminarArticulo(int codigo); //Eliminar articulo

}
