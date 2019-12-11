package com.uberdos.main.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uberdos.main.entities.PaTipoViaje;
import com.uberdos.main.entities.PaViaje;
import com.uberdos.main.entities.Usuario;
import com.uberdos.services.PaViajeService;

@Controller
@RequestMapping(value= "/viaje")
public class PaViajeController {
	
	@Autowired
	PaViajeService sViaje;
	
	@GetMapping("inicio")
	public String register(Model model, PaViaje viaje ) {
		return  "viaje/inicio";
	}
	
	@GetMapping("publicar")
	public String publicar(Model model) {
		List<PaViaje> lista = sViaje.findAll();
		model.addAttribute("lista", lista);
		
		return "publicar";
	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable Integer id) {
		sViaje.delete(id);
		return "redirect:/viaje/inicio";	
	}
	
	@GetMapping("publicar")
	public String add(Model model) {
		List<PaTipoViaje> tipov = sViaje.findAllTipoViaje();
		model.addAttribute("listTipoV", tipov);
		
		List<Usuario> usu = sViaje.findAllUsuario();
		model.addAttribute("listUsu", usu);
		
		return "viaje/publicar";
	}
	
	@PostMapping("guardar")
	public String guardar(HttpServletRequest req) {
		PaViaje viaje = new PaViaje();
		
		int id = (req.getParameter("id") != "")? Integer.parseInt(req.getParameter("id")): 0;
		return null;
		
	}
	
}
