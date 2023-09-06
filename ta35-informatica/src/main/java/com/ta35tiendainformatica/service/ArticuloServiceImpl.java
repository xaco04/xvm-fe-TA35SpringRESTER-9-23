package com.ta35tiendainformatica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta35tiendainformatica.dao.IArticuloDAO;
import com.ta35tiendainformatica.dto.Articulos;

@Service
public class ArticuloServiceImpl implements IArticuloService {
	
	@Autowired
	IArticuloDAO iArticuloDAO;
	
	@Override
	public List<Articulos> listarArticulos() {
		return iArticuloDAO.findAll();
	}
	
	@Override
	public Articulos buscarArticuloCodigo(int codigo) {
		
		return iArticuloDAO.findById(codigo).get();
	}

	@Override
	public Articulos guardarArticulo(Articulos articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulos actualizarArticulo(Articulos articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(int codigo) {
		
		iArticuloDAO.deleteById(codigo);
	}


}
