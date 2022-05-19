package com.UD25.service;

import java.util.List;

import com.UD25.dto.Articulo;


public interface IArticuloService {

	//Metodos CRUD
	public List<Articulo> listarArticulos();
	public Articulo guardarArticulo(Articulo articulo);
	public Articulo articuloXID(int id);
	public Articulo actualizarArticulo(Articulo articulo);
	public void eliminarArticulo(int id);
	
}
