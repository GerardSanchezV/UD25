package com.UD25.dto;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="fabricantes")
public class Fabricante {
	

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;

	
    @OneToMany
    @JoinColumn(name="id")
    private List<Articulo> articulo;
	
	//Constructores
	public Fabricante() {
	
	}

	public Fabricante(int id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
	}
	
	
	//Getters y Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getArticulo() {
		return articulo;
	}

	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}

	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", nombre=" + nombre + ", articulo=" + articulo + "]";
	}
	
	

}