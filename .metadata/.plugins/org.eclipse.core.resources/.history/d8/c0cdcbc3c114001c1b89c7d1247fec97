package com.everis.formativa.controllers;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {
	@RequestMapping("/")
	public String main() {
		return "register.jsp";
	}

	@RequestMapping("/register")
	public String register(Model model, 
			@RequestParam("nombre") @NotBlank @Size(max = 10) String nombre,
			@RequestParam("apellido")@NotBlank @Size(max = 10) String apellido, 
			@RequestParam("limite") @NotBlank @Size(max = 6) String limite,
			@RequestParam("codigo") @NotBlank String codigo) {
		boolean error = false;
		if(Integer.parseInt(limite)<0 && limite.length()<6) {
			model.addAttribute("limiteError", "El límite debe ser un número positivo");
			error=true;
		}
		if(nombre.length()>10 || apellido.length()>10) {
			model.addAttribute("nombreError", "El Nombre y Apellido deben ser menores a 10");
			error=true;
		}
		if(codigo.length()!=8) {
			model.addAttribute("codigoError", "El Código debe tener 8 dígitos");
			error=true;
		}
		if(!error) {
			model.addAttribute("nombre", nombre);
			model.addAttribute("apellido",apellido);
			model.addAttribute("limite", limite);
			model.addAttribute("codigo", codigo);
			return "resultado.jsp";
		}
		return "register.jsp";
	}
}
