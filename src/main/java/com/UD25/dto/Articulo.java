package com.UD25.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulo {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Column(name = "nombre")
		private String nombre;
		@Column(name = "precio")
		private int precio;
		
		@ManyToOne
		
		@JoinColumn(name="fabricante_id")
		private Fabricante fabricante_id;
		
		public Articulo() {
		}
		
		public Articulo(int id, String nombre, int precio, Fabricante fabricante_id) {
			this.id = id;
			this.nombre = nombre;
			this.precio = precio;
			this.fabricante_id = fabricante_id;
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


		public int getPrecio() {
			return precio;
		}


		public void setPrecio(int precio) {
			this.precio = precio;
		}
		
		
		public Fabricante getFabricante() {
			return fabricante_id;
		}
		
		public void setFabricante(Fabricante fabricante) {
			this.fabricante_id = fabricante;
		}
		@Override
		public String toString() {
			return "Articulo [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante_id + "]";
		}




}

