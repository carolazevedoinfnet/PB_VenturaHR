package br.com.infnet.ProjAT.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.ProjAT.negocio.Vaga;
import br.com.infnet.ProjAT.repository.IVagaRepository;

@Service 
public class VagaService {
	
	@Autowired
	private IVagaRepository vagaRepository;


	public void incluir(Vaga vaga) {
		vagaRepository.save(vaga);
		
	}
	public void excluir(Integer id) {
		vagaRepository.deleteById(id);
}
	
	public List<Vaga> obterLista(){
		return (List<Vaga>)vagaRepository.findAll();
	}
}

