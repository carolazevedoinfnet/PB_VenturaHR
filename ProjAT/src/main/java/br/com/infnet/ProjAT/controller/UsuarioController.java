package br.com.infnet.ProjAT.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.infnet.ProjAT.service.VagaService;
import br.com.infnet.ProjAT.service.UsuarioService;
import br.com.infnet.ProjAT.negocio.Usuario;



@Controller 
public class UsuarioController {
	
	@Autowired 
	private UsuarioService usuarioService;
	
	@Autowired
	private VagaService vagaService;
	
	@RequestMapping(value= "/usuario",method = RequestMethod.GET)
	public String showUsuario(
			Model model
			
			) {
	
		model.addAttribute("listaVagas", vagaService.obterLista());
		

		return "usuario/usuario";
	}

	
	@RequestMapping(value= "/usuarios", method = RequestMethod.GET) public
	  String obterListaUsuario(
			  Model model
			  ) {
	  
	  model.addAttribute("listaUsuarios", usuarioService.obterLista());
	  
	  return "usuario/listaUsuarios"; }
	  
	  
	  
	
	  
	  @RequestMapping(value = "/usuario", method = RequestMethod.POST) public
	  String incluir(
			  Model model, 
			  Usuario usuario
		
			  ) {
		  	  usuarioService.incluir(usuario);
		  	  return this.obterListaUsuario(model); }
	  
	  @RequestMapping(value = "/usuario/excluir/{id}", method = RequestMethod.GET)
	  public String excluir(
			  Model model, 
			  @PathVariable Integer id
			  ) {
		  
		  
		  		usuarioService.excluir(id); 
		  		return this.obterListaUsuario(model);

	  
	}
	  
	  }

