package com.ta35almacenes.service;

import java.util.List;

import com.ta35almacenes.dto.Cajas;

public interface ICajaService {
	
	public List<Cajas> listarCajas();

	public Cajas buscarCajaNReferencia(String numReferencia);

	public Cajas guardarCaja(Cajas caja);

	public Cajas actualizarCaja(Cajas caja);

	public void eliminarCaja(String numReferencia);

}
