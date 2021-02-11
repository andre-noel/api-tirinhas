package br.com.vidadeprogramador.tirinha_api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.vidadeprogramador.tirinha_api.model.Tirinha;

public interface TirinhaDao extends CrudRepository<Tirinha, Integer> {
	
}
