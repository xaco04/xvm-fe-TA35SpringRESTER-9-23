package com.ta35empleados.dto;

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
@Table(name = "departamentos")
public class Departamentos {
	
	//Atributos
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "presupuesto")
    private int presupuesto;
    
    @OneToMany(mappedBy = "departamento", fetch = FetchType.LAZY)
    private List<Empleados> empleados;
	
	
    //Constructores
	public Departamentos() {
		
	}
	
	public Departamentos (int codigo, String nombre, int presupuesto) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	// Getters
	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPresupuesto() {
		return presupuesto;
	}
	
	//Setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	@JsonIgnore
	public List<Empleados> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleados> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Departamento [codigo = " + codigo + ", nombre = " + nombre + ", presupuesto = " + presupuesto + "]";
	}
	

}
