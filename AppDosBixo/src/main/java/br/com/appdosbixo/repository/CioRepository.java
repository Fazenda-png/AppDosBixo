package br.com.appdosbixo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.appdosbixo.domain.Cio;

@Repository
public interface CioRepository extends MongoRepository<Cio, String>{

}
