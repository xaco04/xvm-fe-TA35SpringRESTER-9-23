package com.ta35empleados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta35empleados.dao.IDepartamentoDAO;
import com.ta35empleados.dto.Departamentos;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

	@Autowired
	IDepartamentoDAO iDepartamentoDAO;

	@Override
	public List<Departamentos> listarDepartamentos() {
		
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamentos buscarDepartamentoCodigo(int codigo) {
		
		return iDepartamentoDAO.findById(codigo).get();
	}
	
	@Override
	public Departamentos actualizarDepartamento(Departamentos departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}
	
	@Override
	public Departamentos guardarDepartamento(Departamentos departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(int codigo) {
		
		iDepartamentoDAO.deleteById(codigo);
	}

}
