package br.com.infnet.ProjAT.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.ProjAT.negocio.Criterio;



@Repository
public interface ICriterioRepository extends CrudRepository<Criterio, Integer> {

	List<Criterio> findAll(Sort by);
}
