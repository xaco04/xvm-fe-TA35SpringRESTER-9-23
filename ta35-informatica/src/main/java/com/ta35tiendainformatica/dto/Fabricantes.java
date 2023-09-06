package com.ta35tiendainformatica.dto;

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
@Table(name = "fabricantes")
public class Fabricantes {
	
	//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "fabricante", fetch = FetchType.LAZY)
	private List<Articulos> articulos;
	
	
	//Constructores
	
	public Fabricantes() {
		// TODO Auto-generated constructor stub
	}
	
	public Fabricantes(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
		
	}
	
	//Getters
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
		
	}
	
	//Setters
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@JsonIgnore
	public List<Articulos> getArticulos() {
		return articulos;
	}
	
	public void setArticulos(List<Articulos> articulos) {
		this.articulos = articulos;
	}
	
	@Override
	public String toString() {
		return "Fabricante [codigo = " + codigo + ", nombre = " + nombre + " ]";
	}
	

}
