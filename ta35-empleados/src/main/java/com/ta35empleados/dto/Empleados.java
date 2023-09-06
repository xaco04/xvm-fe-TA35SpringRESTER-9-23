package com.ta35empleados.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleados {
	
	// Atributos

	@Id
	@Column(name = "dni")
	private String dni;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@ManyToOne
	@JoinColumn(name = "departamento")
	private Departamentos departamento;

	//COnstructores
	
	public Empleados() {
		// TODO Auto-generated constructor stub
	}
	
	public Empleados(String dni, String nombre, String apellidos, Departamentos departamento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento;
	}

	// Getters
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public Departamentos getDepartamento() {
		return departamento;
	}

	//Setters
	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [dni = " + dni + ", nombre = " + nombre + ", apellidos = " + apellidos + ", departamento = " + departamento + "]";
	}

}
