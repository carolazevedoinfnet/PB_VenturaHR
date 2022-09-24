package br.com.infnet.ProjAT.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.ProjAT.negocio.Resposta;


@Repository
public interface IRespostaRepository extends CrudRepository<Resposta, Integer>{


}
