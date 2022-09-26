package br.com.infnet.ProjAT.controller;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.infnet.ProjAT.negocio.Resposta;
import br.com.infnet.ProjAT.negocio.Criterio;
import br.com.infnet.ProjAT.service.RespostaService;
import br.com.infnet.ProjAT.service.CriterioService;
import br.com.infnet.ProjAT.service.VagaService;
import br.com.infnet.ProjAT.service.UsuarioService;



@Controller
public class RespostaController {

	@Autowired
	private RespostaService respostaService;
	@Autowired
	private CriterioService criterioService;
	@Autowired
	private VagaService vagaService;
	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "/respostas", method = RequestMethod.GET)
	public String obterListaResposta(Model model) {
		model.addAttribute("dataAtual", respostaService.obterLista());
		model.addAttribute("dataLimite", respostaService.obterLista());
		model.addAttribute("criterios", criterioService.obterLista());
		model.addAttribute("usuarios", usuarioService.obterLista());
		model.addAttribute("vagas", vagaService.obterLista());
		model.addAttribute("listaResposta", respostaService.obterLista());

		return "resposta/listaResposta";
	}

	@PostMapping(value = "/resposta")
	public String resposta(Model model, Resposta resposta) {
		respostaService.incluir(resposta);
		return "redirect:/resposta";

	}

	@RequestMapping(value = "/resposta", method = RequestMethod.GET)
	public String showResposta(Model model) {
		model.addAttribute("usuarios", usuarioService.obterLista());
		model.addAttribute("vagas", vagaService.obterLista());
		model.addAttribute("criterios", criterioService.obterLista());
		
		return "resposta/resposta";
	}

	@RequestMapping(value = "/resposta/incluir", method = RequestMethod.POST)
	public String incluir(Model model, Resposta resposta, @RequestParam String dataResposta,
			@RequestParam String horaResposta, @RequestParam Optional<String[]> criterioIds) {

		if (criterioIds.isPresent()) {
			List<Criterio> lista = new ArrayList<Criterio>();

			for (String id : criterioIds.get()) {
				lista.add(criterioService.obterPorId(Integer.valueOf(id)));
			}

			resposta.setCriterios(lista);
		}

		;

		respostaService.incluir(resposta);

		return this.obterListaResposta(model);
	}

	@RequestMapping(value = "/resposta/excluir/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {
		respostaService.excluir(id);
		return this.obterListaResposta(model);
	}

}