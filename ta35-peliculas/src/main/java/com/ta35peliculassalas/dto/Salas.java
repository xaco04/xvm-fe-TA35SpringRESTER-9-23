package com.ta35peliculassalas.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "salas")
public class Salas {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "pelicula", nullable = true)
	private Peliculas pelicula;

	// COnstructores 
	public Salas() {
		// TODO Auto-generated constructor stub
	}
	
	public Salas(int codigo, String nombre, Peliculas pelicula) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	// Getters
	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Peliculas getPelicula() {
		return pelicula;
	}
	
	// Setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Sala [codigo = " + codigo + ", nombre = " + nombre + ", pelicula = " + pelicula + "]";
	}

}
