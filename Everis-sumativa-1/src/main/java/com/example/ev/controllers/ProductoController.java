package com.example.ev.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ev.models.Producto;
import com.example.ev.services.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController{
	
	//Service
	private final ProductoService ps;
	public ProductoController(ProductoService productoService) {
		this.ps = productoService;
	}
    
    //Read
    @RequestMapping("")
	public String index(@ModelAttribute("producto") Producto producto, Model model) {
		List<Producto> lista_productos = ps.findAll();
		model.addAttribute("lista_productos", lista_productos);
		return "producto.jsp";
	}
    
    //Create
    @RequestMapping(value = "/crear", method = RequestMethod.POST)
	public String crear(@Valid @ModelAttribute("producto") Producto producto, Model model) {	
    	
    	//nombre, codigo, categoria, precio.
    	if(producto.getNombre().length()<1 || producto.getCodigo()<1 || producto.getCategoria().length()<1 || producto.getPrecio()<1) {
    		model.addAttribute("error", "Los campos ingresados no cumplen las condiciones");
    		List<Producto> lista_productos = ps.findAll();
    		model.addAttribute("lista_productos", lista_productos);
    		return "producto.jsp";
    	}
    	else {
    		Producto producto1 = ps.crearProducto(producto);
    		return "redirect:/producto";
    	}
    	
		
	}
    
    //Update
    @RequestMapping(value="/actualizar/{id}", method= RequestMethod.GET)
	public String actualizar(@PathVariable("id") Long id, Model model) {
		Producto producto = ps.buscarProducto(id);
		model.addAttribute("producto",producto);
		return "editarproducto.jsp";
	}

	@RequestMapping(value="/modificar", method= RequestMethod.POST)
	public String modificar(@Valid @ModelAttribute("producto") Producto producto, RedirectAttributes redirectAttrs) {
		if(producto.getNombre().length()<1 || producto.getCodigo()<1 || producto.getCategoria().length()<1 || producto.getPrecio()<1) {
			redirectAttrs.addFlashAttribute("error", "Los campos ingresados no cumplen las condiciones");
			return "redirect:/producto/actualizar/"+producto.getId();
		}
		else {
			ps.modificarProducto(producto);
			return "redirect:/producto";
		}
	
	}
    
    //Delete
	@RequestMapping(value="/eliminar/{id}", method= RequestMethod.POST)
	public String eliminar(@PathVariable("id") Long id) {
		ps.eliminarProducto(id);
		return "redirect:/producto";
	}

}