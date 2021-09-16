package com.example.ev.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.ev.models.Venta;
import com.example.ev.services.VentaService;

@Controller
@RequestMapping("/venta")
public class VentaController{
	
	//Service
	private final VentaService vs;
	public VentaController(VentaService ventaService) {
		this.vs = ventaService;
	}
    
    //Read
    @RequestMapping("")
	public String index(@ModelAttribute("venta") Venta venta, Model model) {
		List<Venta> lista_ventas = vs.findAll();
		model.addAttribute("lista_ventas", lista_ventas);
		return "venta.jsp";
	}
    
    //Create
    @RequestMapping(value = "/crear", method = RequestMethod.POST)
	public String crear(@Valid @ModelAttribute("venta") Venta venta) {	
		Venta venta1 = vs.crearVenta(venta);
		return "redirect:/venta";
	}
    
    //Update
    @RequestMapping(value="/actualizar/{id}", method= RequestMethod.GET)
	public String actualizar(@PathVariable("id") Long id, Model model) {
		Venta venta = vs.buscarVenta(id);
		model.addAttribute("venta",venta);
		return "editarventa.jsp";
	}

	@RequestMapping(value="/modificar", method= RequestMethod.POST)
	public String modificar(@Valid @ModelAttribute("venta") Venta venta) {
		vs.modificarVenta(venta);
		return "redirect:/venta";
	}
    
    //Delete
	@RequestMapping(value="/eliminar/{id}", method= RequestMethod.POST)
	public String eliminar(@PathVariable("id") Long id) {
		vs.eliminarVenta(id);
		return "redirect:/venta";
	}

}