package com.example.demo.controllers;

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

import com.example.demo.models.Empleado;
import com.example.demo.services.EmpleadoService;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private EmpleadoService es;
	
	@GetMapping("/empleados")
	public List<Empleado> obtenerEmpleados(){
		return es.findAll();
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado obtenerEmpleado(@PathVariable("id") Long id) {
		Empleado em = es.buscarEmpleado(id);
		if(em == null) {
			throw new RuntimeException("Usuario no encontrado "+id); 
		}
		else {
			return em;
		}
	}
	
	@DeleteMapping("/empleados/{id}")
	public String eliminarEmpleado(@PathVariable("id") Long id) {
		Empleado em = es.buscarEmpleado(id);
		if(em == null) {
			return "Empleado no encontrado"; 
		}
		else {
			es.eliminarEmpleado(id);
			return "Empleado eliminado";
		}
	}
	
	@PostMapping("/empleados")
	public Empleado crearEmpleado(@RequestBody Empleado em) {
		em.setId(0L); //Asigna un id 0 de tipo long
		return es.crearEmpleado(em);
	}
	
	@PutMapping("/empleados")
	public Empleado actualizarEmpleado(@RequestBody Empleado em) {
		return es.crearEmpleado(em);
	}
	
}
