package br.com.infnet.ProjAT.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.ProjAT.negocio.Usuario;
import br.com.infnet.ProjAT.repository.IUsuarioRepository;



@Service 
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;

	public Usuario isValid(String login, String senha) {
		
		
	
		return usuarioRepository.autenticacao(login, senha);
	}

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public List<Usuario> obterLista(){
		return (List<Usuario>)usuarioRepository.findAll();
	}

	
	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
}
	
}
