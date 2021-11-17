package br.com.appdosbixo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.appdosbixo.domain.Doenca;

@Repository
public interface DoencaRepository extends MongoRepository<Doenca, String> {

}
