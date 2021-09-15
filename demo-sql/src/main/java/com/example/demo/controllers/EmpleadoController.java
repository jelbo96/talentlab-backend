package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Empleado;
import com.example.demo.services.EmpleadoService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

	//Dependencia con el service
	private final EmpleadoService es;
	public EmpleadoController(EmpleadoService empleadoService) {
		this.es = empleadoService;
	}

	@RequestMapping("")
	public String index(@ModelAttribute("empleado") Empleado empleado, Model model) {

		List<Empleado> lista_empleados = es.findAll();
		model.addAttribute("lista_empleados", lista_empleados);
		return "empleado.jsp";
	}

	@RequestMapping(value = "/crear", method = RequestMethod.POST)
	public String crear(@Valid @ModelAttribute("empleado") Empleado empleado) {
		System.out.println("Crear"+ empleado.getRut());
		//llamado a guadar el objeto empleado		
		Empleado empleado1 = es.crearEmpleado(empleado);
		return "redirect:/empleado";
	}

	
	//METODO ACTUALIZAR
	@RequestMapping(value="/actualizar/{id}", method= RequestMethod.GET)
	public String actualizar(@PathVariable("id") Long id, Model model) {
		System.out.println("Actualizar id"+id);
		
		//Obtener el empleado con el id
		Empleado empleado = es.buscarEmpleado(id);
		model.addAttribute("empleado",empleado);
		
		return "editarempleado.jsp";
	}

	
	@RequestMapping(value="/modificar", method= RequestMethod.POST)
	public String modificar(@Valid @ModelAttribute("empleado") Empleado empleado) {
		//Obtener el empleado con el id
		System.out.println(empleado.getId());
		es.modificarEmpleado(empleado);
		
		return "redirect:/empleado";
	}
	
	
	//METODO ELIMINAR
	@RequestMapping(value="/eliminar/{id}", method= RequestMethod.POST)
	public String eliminar(@PathVariable("id") Long id) {
		System.out.println("Eliminar" + id);
		es.eliminarEmpleado(id);
		return "redirect:/empleado";
	}

	@RequestMapping("/buscar")
	public String buscar() {
		System.out.println("Buscar");
		return "OK buscar";
	}



}
