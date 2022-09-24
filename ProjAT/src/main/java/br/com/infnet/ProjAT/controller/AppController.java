package br.com.infnet.ProjAT.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;



@Controller
public class AppController {

	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showInit() {
		return "home";
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
