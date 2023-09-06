package com.ta35almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta35almacenes.dao.ICajaDAO;
import com.ta35almacenes.dto.Cajas;

@Service
public class CajaServiceImpl implements ICajaService{
	
	@Autowired
	ICajaDAO iCajaDAO;

	@Override
	public List<Cajas> listarCajas() {
		
		return iCajaDAO.findAll();
	}

	@Override
	public Cajas buscarCajaNReferencia(String numReferencia) {
		
		return iCajaDAO.findById(numReferencia).get();
	}

	@Override
	public Cajas guardarCaja(Cajas caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public Cajas actualizarCaja(Cajas caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String numReferencia) {
		
		iCajaDAO.deleteById(numReferencia);
	}

}
