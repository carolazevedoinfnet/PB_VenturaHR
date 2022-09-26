package br.com.infnet.ProjAT.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.infnet.ProjAT.negocio.Vaga;
import br.com.infnet.ProjAT.service.VagaService;

@Controller 
public class VagaController {

	
	@Autowired 
	private VagaService vagaService;

	
	@RequestMapping(value= "/vagas", method = RequestMethod.GET) 
	public String obterListaVagas(
			  Model model
			  ) {
	  
	  model.addAttribute("listaVagas", vagaService.obterLista());
	  
	  return "vaga/listaVagas"; }
	  
	  
	  
		@RequestMapping(value= "/vaga",method = RequestMethod.GET)
		public String showVaga() {
			return "vaga/vaga";
		}
	  
	  @RequestMapping(value = "/vaga", method = RequestMethod.POST) 
	  public String incluir(
			  Model model, 
			  Vaga vaga
			  ) {
		
		
		  vagaService.incluir(vaga);
		  	return this.obterListaVagas(model); }
	  
	  
	  @RequestMapping(value = "/vaga/excluir/{id}", method = RequestMethod.GET)
	  public String excluir(
			  Model model, 
			  @PathVariable Integer id ) {
		  vagaService.excluir(id); 
	return this.obterListaVagas(model); 
	}
	  
	  }
