package br.com.infnet.ProjAT.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import br.com.infnet.ProjAT.negocio.Criterio;

import br.com.infnet.ProjAT.service.CriterioService;


@Controller
public class CriterioController {

	
	@Autowired 
	private CriterioService criterioService;
	
	
	@RequestMapping(value= "/criterios", method = RequestMethod.GET) 
	public String obterListaCriterios(
			  Model model
			  ) {
	  
	  model.addAttribute("listaCriterios", criterioService.obterLista());
	  
	  return "criterio/listaCriterios"; }
	  
	  
	@RequestMapping(value= "/criterio",method = RequestMethod.GET)
	public String showCriterio() {
		return "criterio/criterio";
	}
	
	  
	  @RequestMapping(value = "/criterio", method = RequestMethod.POST) 
	  public String incluir(
			  Model model, 
			  Criterio criterio
			  ) {

			  criterioService.incluir(criterio);
		  	return this.obterListaCriterios(model); }

	  
	  @RequestMapping(value = "/criterio/excluir/{id}", method = RequestMethod.GET)
	  public String excluir(
			  Model model, 
			  @PathVariable Integer id ) {
		  criterioService.excluir(id); 
	return this.obterListaCriterios(model); 
	}
	  
	  }