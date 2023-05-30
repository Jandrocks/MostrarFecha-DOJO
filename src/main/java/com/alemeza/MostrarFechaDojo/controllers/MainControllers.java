package com.alemeza.MostrarFechaDojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainControllers {
	@RequestMapping("/")
	public String bienvenido() {
		return "index.jsp";
	}
}
