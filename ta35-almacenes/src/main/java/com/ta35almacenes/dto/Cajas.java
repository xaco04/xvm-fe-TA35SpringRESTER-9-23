package com.ta35almacenes.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajas")
public class Cajas {
	
	// Atributos
	@Id
	@Column(name = "num_referencia", length = 4)
	private String numReferencia;
	
	@Column(name = "contenido")
	private String contenido;
	
	@Column(name = "valor")
	private int valor;
	
	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacenes almacen;

	
	// Constructores
	public Cajas() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Cajas(String numReferencia, String contenido, int valor, Almacenes almacen) {
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	// Getters
	public String getNumReferencia() {
		return numReferencia;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public int getValor() {
		return valor;
	}
	
	public Almacenes getAlmacen() {
		return almacen;
	}
	
	//Setters

	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}


	public void setAlmacen(Almacenes almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [numReferencia = " + numReferencia + ", contenido = " + contenido + ", valor = " + valor + ", almacen = "
				+ almacen + "]";
	}

}
