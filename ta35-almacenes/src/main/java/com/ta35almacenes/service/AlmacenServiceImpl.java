package com.ta35almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta35almacenes.dao.IAlmacenDAO;
import com.ta35almacenes.dto.Almacenes;

@Service
public class AlmacenServiceImpl implements IAlmacenService {
	
	@Autowired
	IAlmacenDAO iAlmacenDAO;

	@Override
	public List<Almacenes> listarAlmacenes() {
		
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacenes buscarAlmacenCodigo(int codigo) {
		
		return iAlmacenDAO.findById(codigo).get();
	}

	@Override
	public Almacenes guardarAlmacen(Almacenes almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacenes actualizarAlmacen(Almacenes almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int codigo) {
		
		iAlmacenDAO.deleteById(codigo);
	}
}
