package com.ta35almacenes.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "almacenes")
public class Almacenes {
	
	// Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	
	@Column(name = "lugar")
    private String lugar;
	
	@Column(name = "capacidad")
	private int capacidad;
	
	@OneToMany(mappedBy = "almacen", fetch = FetchType.LAZY)
	private List<Cajas> cajas;
	
	//Constructores
	
	public Almacenes() {
		// TODO Auto-generated constructor stub
	}
	
	public Almacenes(int codigo, String lugar, int capacidad) {
		this.codigo = codigo;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	// Getters
	public int getCodigo() {
		return codigo;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public int getCapacidad() {
		return capacidad;
	}

	// Setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	
	@JsonIgnore
	public List<Cajas> getCajas() {
		return cajas;
	}

	public void setCajas(List<Cajas> cajas) {
		this.cajas = cajas;
	}

	@Override
	public String toString() {
		return "Almacen [codigo = " + codigo + ", lugar = " + lugar + ", capacidad = " + capacidad + "]";
	}

}
