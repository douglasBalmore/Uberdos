package com.uberdos.main.controllers;

import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uberdos.main.entities.Usuario;
import com.uberdos.main.entities.UsuarioForm;
import com.uberdos.main.repositories.IUsuarioRepository;

@Controller
@RequestMapping(value = "userController")
public class UsuarioController {
	
	private final IUsuarioRepository iUsuarioRepository;
	
	public UsuarioController(IUsuarioRepository iUsuarioRepository) {
		this.iUsuarioRepository = iUsuarioRepository;
	}
	
	@GetMapping("register")
	public String register(Model model, UsuarioForm usuarioForm) {
		return "register";
	}

	@PostMapping("/register")
	public String register(Model model, Usuario usuario, UsuarioForm usuarioForm, HttpServletRequest req , BindingResult result) throws ParseException {
		
		Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("fecha_nacimiento"));
		
		//if (usuarioForm.getName().matches("^[a-zA-Z0-9]{3,}$") && req.getParameter("repetirContrasenhia") != null && req.getParameter("repetirContrasenhia").equals(usuarioForm.getPassword())){
			usuario = new Usuario(usuarioForm.getName().trim(), 
					usuarioForm.getApellido().trim(),
					usuarioForm.getDui().trim(),
					fecha,
					usuarioForm.getDireccion().trim(),
					usuarioForm.getTelefono().trim(),
					usuarioForm.getEmail().trim(),
					new BCryptPasswordEncoder().encode(usuarioForm.getPassword()),
					usuarioForm.getSexo(),
					true,
					"Estandar");
			
		/*}
		else {
			result.rejectValue("name", "username");
			return "register";
		}*/

		try {
			this.iUsuarioRepository.save(usuario);
		} catch(DataIntegrityViolationException ex){
			ex.printStackTrace();
			result.rejectValue("name", "name");
			return "register";
		}

		return "redirect:/";
	}
	
	@PostMapping("/update")
	public String update(Model model, Usuario usuario, HttpServletRequest req , BindingResult result) throws ParseException {
		
		Long id = Long.parseLong(req.getParameter("id"));
		Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("fecha_nacimiento"));
		
		if (req.getParameter("name").matches("^[a-zA-Z0-9]{3,}$")){
			
			usuario = iUsuarioRepository.findById(id).get();
			
			usuario.setName(req.getParameter("name").trim());
			usuario.setApellido(req.getParameter("apellido").trim());
			usuario.setSexo(req.getParameter("sexo").trim());
			usuario.setEmail(req.getParameter("email").trim());
			usuario.setFecha(fecha);
			usuario.setTelefono(req.getParameter("telefono"));
			usuario.setEnabled(true);
			
		}
		else {
			result.rejectValue("name", "username");
			return "profile";
		}

		try {
			this.iUsuarioRepository.save(usuario);
		} catch(DataIntegrityViolationException ex){
			ex.printStackTrace();
			result.rejectValue("name", "name");
			return "profile";
		}

		return "profile";
	}
	
	@GetMapping("/users")
	public String listUsers(Model model){
		model.addAttribute("users", iUsuarioRepository.findAll());
		return "users";
	}

	//Primer método que se carga al arrancar el programa
	@GetMapping("/")
	public String profile(Model model, Principal principal, UsuarioForm usuarioForm) throws Exception {
		if (principal == null) {
			model.addAttribute("usuarioForm", usuarioForm);
			return "index";
		}
		
		Usuario user = iUsuarioRepository.findByEmail(principal.getName()).orElseThrow(() -> new Exception());
		
		model.addAttribute("usuario", user);
		
		return "profile";
	}
	
	@GetMapping("log")
	public String log() {
		return "login";
	}
}