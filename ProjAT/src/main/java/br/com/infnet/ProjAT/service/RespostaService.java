package br.com.infnet.ProjAT.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.ProjAT.negocio.Resposta;
import br.com.infnet.ProjAT.repository.IRespostaRepository;


@Service 
public class RespostaService {

	@Autowired
	private IRespostaRepository respostaRepository;


	public void incluir(Resposta resposta) {
		respostaRepository.save(resposta);
		
	}
	
	public List<Resposta> obterLista(){
		return (List<Resposta>)respostaRepository.findAll();
	}
	

	
	public Resposta obterPorId (Integer id) {
		return respostaRepository.findById(id).orElse(null);
	}
	

	public void excluir(Integer id) {
		respostaRepository.deleteById(id);
}
	

}
