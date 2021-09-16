package com.example.ev.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.ev.models.Producto;
import com.example.ev.repositories.ProductoRepository;

@Service
public class ProductoService {

	//nombre, codigo, categoria, precio.
	private final ProductoRepository er;
	
	public ProductoService(ProductoRepository productoRepository) {
		this.er = productoRepository;
	}
	
	
	public Producto crearProducto(@Valid Producto producto) {
	    return er.save(producto);
	}

	public List<Producto> findAll() {
	    return er.findAll();
	}

	public void eliminarProducto(Long id) {
	    er.deleteById(id);
	}

	public Producto buscarProducto(Long id) {
	    Optional<Producto> oProducto = er.findById(id); //Manejo del optional
	    if(oProducto.isPresent()) {
	        return oProducto.get();
	    }
	    else {
	        return null;
	    }
	}

	public void modificarProducto(@Valid Producto producto) {
	    er.save(producto);
	}

	
	
}
