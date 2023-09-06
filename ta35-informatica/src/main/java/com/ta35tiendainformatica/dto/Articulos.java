package com.ta35tiendainformatica.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "articulos")
public class Articulos {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precio")
	private int precio;
	
	@ManyToOne
	@JoinColumn(name = "fabricante")
	private Fabricantes fabricante;
	
	
	//Constructores
	public Articulos() {
		// TODO Auto-generated constructor stub
	}
	
	public Articulos(int codigo, String nombre, int precio, Fabricantes fabricante) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
		
	}
	
	
	//Getters
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precio;
		
	}
	public Fabricantes getFabricante() {
		return fabricante;
	}

	//Setters
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setFabricante(Fabricantes fabricante) {
		this.fabricante = fabricante;
	}
	
	@Override
	public String toString() {
		return "Articulo [codigo = " + codigo + ", nombre = " + nombre + ", precio = " + precio + ", fabricante = " + fabricante + "]";
	}
	
}
