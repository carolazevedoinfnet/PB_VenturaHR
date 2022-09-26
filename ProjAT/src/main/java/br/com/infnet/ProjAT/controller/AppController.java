package br.com.infnet.ProjAT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.com.infnet.ProjAT.negocio.Usuario;
import br.com.infnet.ProjAT.service.UsuarioService;

@Controller
@SessionAttributes("user")
public class AppController {

	@Autowired 
	private UsuarioService usuarioService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showInit() {
		
		
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin() {
		return this.showInit();
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showHome(
				Model model,
				@RequestParam String login,
				@RequestParam String senha
			) {

		
		Usuario usuario = new Usuario();
		usuario.setNome("Carolina");
		usuario.setLogin("Carolina");
		usuario.setSenha("Carolina");
		
		model.addAttribute("user", usuario);
		return "home";
		
		
	}
	
	
	
	@RequestMapping(value= "/admin",method = RequestMethod.GET)
	public String showAdministrador() {
		return "admin/admin";
	}
	
	@RequestMapping(value= "/candidato",method = RequestMethod.GET)
	public String showCandidato() {
		return "candidato/candidato";
	}
	
	@RequestMapping(value= "/empresa",method = RequestMethod.GET)
	public String showEmpresa() {
		return "empresa/empresa";
	}
	
	
	@RequestMapping(value = "/voltar", method = RequestMethod.GET) 
	public String voltar() {		
		return "home";
	}
	
	@RequestMapping(value = "/sair", method = RequestMethod.GET)
	public String sair(SessionStatus session) {
		
		session.setComplete();
		
		return "home";
	}
}
