package br.com.infnet.ProjAT.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.ProjAT.negocio.Usuario;





@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {

}