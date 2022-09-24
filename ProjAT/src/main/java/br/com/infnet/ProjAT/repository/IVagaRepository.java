package br.com.infnet.ProjAT.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.ProjAT.negocio.Vaga;





@Repository
public interface IVagaRepository extends CrudRepository<Vaga, Integer> {

}
