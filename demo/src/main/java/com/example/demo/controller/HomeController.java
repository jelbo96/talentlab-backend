package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping("/1")
	public String pagina1() {
		return "index.jsp";
	}
	
	//JSP con parametro
	@RequestMapping("/2")
	public String pagina2(Model model) {
		model.addAttribute("parametro1", "clase everis");
		model.addAttribute("parametro2", "clase everis mañana");
		
		return "index.jsp";
	}
	
	/*@RequestMapping(value="/get", method = RequestMethod.GET)
	public String pagina2() {
		return "Hola mundo2 desde main";
	}
	
	@RequestMapping("/2/3/4")
	public String pagina3() {
		return "Hola mundo2/3/4 desde main";
	}
	*/
}
