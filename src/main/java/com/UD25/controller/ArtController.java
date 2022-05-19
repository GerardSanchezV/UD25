package com.UD25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UD25.dto.Articulo;
import com.UD25.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArtController {
	
	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articuloServiceImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulo salvarArticulo(@RequestBody Articulo articulo) {
		
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulo articuloXID(@PathVariable(name="id") int id) {
		
		Articulo articulo_xid= new Articulo();		
		articulo_xid=articuloServiceImpl.articuloXID(id);	
		return articulo_xid;
	}
	
	@PutMapping("/articulos/{id}")
	public Articulo actualizarArticulo(@PathVariable(name="id")int id,@RequestBody Articulo articulo) {
		
		Articulo articulo_seleccionado= new Articulo();
		Articulo articulo_actualizado= new Articulo();
		
		articulo_seleccionado= articuloServiceImpl.articuloXID(id);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		
		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);

		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarArticulo(@PathVariable(name="id")int id) {
		articuloServiceImpl.eliminarArticulo(id);
	}

}
