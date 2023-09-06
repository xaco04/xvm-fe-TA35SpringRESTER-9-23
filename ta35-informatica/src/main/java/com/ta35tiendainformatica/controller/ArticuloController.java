package com.ta35tiendainformatica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ta35tiendainformatica.dto.Articulos;
import com.ta35tiendainformatica.service.ArticuloServiceImpl;

@RestController
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulos> listarArticulos() {
		
		return articuloServiceImpl.listarArticulos();
	}
	
	@GetMapping("/articulos/{codigo}")
	public Articulos buscarArticuloPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return articuloServiceImpl.buscarArticuloCodigo(codigo);
	}
	
	@PostMapping("/articulos")
	public Articulos guardarArticulo(@RequestBody Articulos articulo) {
		
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	@PutMapping("/articulos/{codigo}")
	public Articulos actualizarArticulo(@PathVariable(name = "codigo") int codigo, @RequestBody Articulos articulo) {
		
		Articulos articuloSeleccionado = new Articulos();
		Articulos articuloActualizado = new Articulos();
		
		articuloSeleccionado = articuloServiceImpl.buscarArticuloCodigo(codigo);
		
		articuloSeleccionado.setNombre(articulo.getNombre());
		
		articuloActualizado = articuloServiceImpl.actualizarArticulo(articuloSeleccionado);
		
		return articuloActualizado;
	}
	
	@DeleteMapping("/articulos/{codigo}")
	public void eliminarArticulo(@PathVariable(name = "codigo") int codigo) {
		
		articuloServiceImpl.eliminarArticulo(codigo);
	}

}
