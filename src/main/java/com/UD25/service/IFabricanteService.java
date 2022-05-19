package com.UD25.service;

import java.util.List;

import com.UD25.dto.Fabricante;

public interface IFabricanteService {
	public List<Fabricante> listarFabricantes();
	public Fabricante guardarFabricante(Fabricante fabricante);
	public Fabricante fabricanteXID(int id);
	public Fabricante actualizarFabricante(Fabricante fabricante);
	public void eliminarFabricante(int id);
	
}
