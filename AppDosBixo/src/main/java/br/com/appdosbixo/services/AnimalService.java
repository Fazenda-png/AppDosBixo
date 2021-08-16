package br.com.appdosbixo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appdosbixo.domain.Animal;
import br.com.appdosbixo.repository.AnimalRepository;
import br.com.appdosbixo.services.exception.ObjectNotFoundException;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository animalRepository;
	

	public Optional<Animal> findById(String id) {
		Optional<Animal> obj = animalRepository.findById(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Object not found");
		}
		return obj;
	}
}
