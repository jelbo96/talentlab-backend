package com.example.demo.controler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Parametros {

	@RequestMapping("/parametro")
	public String inicio(@RequestParam(value="x", required= false) String parametro, 
			@RequestParam(value="x2") String parametro2) {

		return "Parametro pasado: "+parametro+"  - Parametro 2: "+parametro2;
	}

	@RequestMapping("/parametro2/{value}/{value2}")
	public String inicio2(@PathVariable("value") String valor,
			@PathVariable("value2") String valor2)  {
		return "Parametro pasado: "+Integer.parseInt(valor2) + "  -   "+ Integer.parseInt(valor2);
	}


}
