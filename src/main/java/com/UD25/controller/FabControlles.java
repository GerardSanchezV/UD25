package com.UD25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.UD25.dto.Fabricante;
import com.UD25.service.FabricanteServiceImpl;

@RequestMapping("/api")
public class FabControlles {
	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@GetMapping("/Fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServiceImpl.listarFabricantes();
		
	}
	@PostMapping("/Fabricantes")
	public Fabricante salvarCliente(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	@GetMapping("/Fabricantes")
	public Fabricante fabricanteXID(@PathVariable(name="id")int id) {
		Fabricante fabricante_xid= new Fabricante();
		fabricante_xid=fabricanteServiceImpl.fabricanteXID(id);
		return fabricante_xid;
	}
	@GetMapping("/Fabricante/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="id")int id,@RequestBody Fabricante fabricante) {
			Fabricante fabricante_seleccionado= new Fabricante();
			Fabricante fabricante_actualizado= new Fabricante();
			fabricante_seleccionado = fabricanteServiceImpl.fabricanteXID(id);
			fabricante_seleccionado.setNombre(fabricante.getNombre());
			fabricante_actualizado = fabricanteServiceImpl.actualizarFabricante(fabricante_actualizado);
			return fabricante_actualizado;
			
	}
	@DeleteMapping("/Fabricante{id}")
	public void eliminarFabricante(@PathVariable(name = "id")int id) {
		fabricanteServiceImpl.eliminarFabricante(id);
	}
	

}
