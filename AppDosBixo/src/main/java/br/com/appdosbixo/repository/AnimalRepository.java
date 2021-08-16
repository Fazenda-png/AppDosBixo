package br.com.appdosbixo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.appdosbixo.domain.Animal;

@Repository
public interface AnimalRepository extends MongoRepository<Animal, String>{

	
}
