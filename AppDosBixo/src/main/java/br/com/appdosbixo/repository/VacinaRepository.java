package br.com.appdosbixo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.appdosbixo.domain.Vacina;

@Repository
public interface VacinaRepository extends MongoRepository<Vacina, String>{

}
