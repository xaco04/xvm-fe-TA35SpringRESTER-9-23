package com.ta35empleados.service;

import java.util.List;

import com.ta35empleados.dto.Departamentos;

public interface IDepartamentoService {
	
	public List<Departamentos> listarDepartamentos();

	public Departamentos buscarDepartamentoCodigo(int codigo);
	
	public Departamentos actualizarDepartamento(Departamentos departamento);

	public Departamentos guardarDepartamento(Departamentos departamento);

	public void eliminarDepartamento(int codigo);

}
