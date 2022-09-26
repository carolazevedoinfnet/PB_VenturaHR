package br.com.infnet.ProjAT.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.ProjAT.negocio.Criterio;
import br.com.infnet.ProjAT.repository.ICriterioRepository;



@Service 
public class CriterioService {

	@Autowired
	private ICriterioRepository criterioRepository;


	public void incluir(Criterio criterio) {
		criterioRepository.save(criterio);
		
	}
	
	public List<Criterio> obterLista(){
		return (List<Criterio>)criterioRepository.findAll();
	}
	
	public Criterio obterPorId (Integer id) {
		return criterioRepository.findById(id).orElse(null);
	}
	
	public void excluir(Integer id) {
		criterioRepository.deleteById(id);
}
	
	
}

