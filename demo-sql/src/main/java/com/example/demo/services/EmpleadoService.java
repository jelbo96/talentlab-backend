package com.example.demo.services;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Empleado;
import com.example.demo.repositories.EmpleadoRepository;

@Service
public class EmpleadoService {

	//Logica de negocio

	private final EmpleadoRepository er;
	public EmpleadoService(EmpleadoRepository empleadoRepository) {
		this.er = empleadoRepository;
	}

	public Empleado crearEmpleado(@Valid Empleado empleado) {
		return er.save(empleado);
	}

	public List<Empleado> findAll() {
		return er.findAll();
	}

	public void eliminarEmpleado(Long id) {
		er.deleteById(id);
	}

	public Empleado buscarEmpleado(Long id) {
		Optional<Empleado> oEmpleado = er.findById(id); //Manejo del optional
		if(oEmpleado.isPresent()) {
			return oEmpleado.get();
		}
		else {
			return null;
		}
	}

	public void modificarEmpleado(@Valid Empleado empleado) {
		er.save(empleado);
	}



}
