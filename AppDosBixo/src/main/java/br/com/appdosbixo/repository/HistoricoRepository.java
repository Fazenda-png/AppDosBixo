package br.com.appdosbixo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.appdosbixo.domain.Historico;

@Repository
public interface HistoricoRepository extends MongoRepository<Historico, String>{

	
}
