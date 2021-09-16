package com.example.ev.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.ev.models.Venta;
import com.example.ev.repositories.VentaRepository;

@Service
public class VentaService {

	//Traer el repository
	private final VentaRepository er;  
	
	public VentaService(VentaRepository ventaRepository) {
		this.er = ventaRepository;
	}
	
	public Venta crearVenta(@Valid Venta venta) {
	    return er.save(venta);
	}

	public List<Venta> findAll() {
	    return er.findAll();
	}

	public void eliminarVenta(Long id) {
	    er.deleteById(id);
	}

	public Venta buscarVenta(Long id) {
	    Optional<Venta> oVenta = er.findById(id); //Manejo del optional
	    if(oVenta.isPresent()) {
	        return oVenta.get();
	    }
	    else {
	        return null;
	    }
	}

	public void modificarVenta(@Valid Venta venta) {
	    er.save(venta);
	}

	
	
}
