package com.example.ev.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.ev.models.Usuario;
import com.example.ev.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController{
	
	//Service
	private final UsuarioService us;
	public UsuarioController(UsuarioService usuarioService) {
		this.us = usuarioService;
	}
    
    //Read
    @RequestMapping("")
	public String index(@ModelAttribute("usuario") Usuario usuario, Model model) {
		List<Usuario> lista_usuarios = us.findAll();
		model.addAttribute("lista_usuarios", lista_usuarios);
		return "usuario.jsp";
	}
    
    //Create
    @RequestMapping(value = "/crear", method = RequestMethod.POST)
	public String crear(@Valid @ModelAttribute("usuario") Usuario usuario) {	
		Usuario usuario1 = us.crearUsuario(usuario);
		return "redirect:/usuario";
	}
    
    //Update
    @RequestMapping(value="/actualizar/{id}", method= RequestMethod.GET)
	public String actualizar(@PathVariable("id") Long id, Model model) {
		Usuario usuario = us.buscarUsuario(id);
		model.addAttribute("usuario",usuario);
		return "editarusuario.jsp";
	}

	@RequestMapping(value="/modificar", method= RequestMethod.POST)
	public String modificar(@Valid @ModelAttribute("usuario") Usuario usuario) {
		us.modificarUsuario(usuario);
		return "redirect:/usuario";
	}
    
    //Delete
	@RequestMapping(value="/eliminar/{id}", method= RequestMethod.POST)
	public String eliminar(@PathVariable("id") Long id) {
		us.eliminarUsuario(id);
		return "redirect:/usuario";
	}

}