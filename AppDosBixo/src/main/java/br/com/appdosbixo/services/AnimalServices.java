package br.com.appdosbixo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appdosbixo.DTO.AnimalDTO;
import br.com.appdosbixo.domain.Animal;
import br.com.appdosbixo.repository.AnimalRepository;
import br.com.appdosbixo.services.exception.ObjectNotFoundException;

@Service
public class AnimalServices {

	@Autowired
	private AnimalRepository animalRepository;
	
	public List<Animal> findAll() {
		return animalRepository.findAll();
	}

	public Animal findById(String id) {
		Optional<Animal> obj = animalRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public Animal insert(Animal obj) {
		return animalRepository.insert(obj);
	}

	public Animal FromDTO(AnimalDTO objdto) {
		return new Animal(objdto.getId(), objdto.getNumero(), objdto.getPesoInicial(), objdto.getNumeroMae(), objdto.getNomePai(), objdto.getRacaPai(), objdto.getRacaMae(), objdto.getSexo(), objdto.getTipoAnimal());
	}

	public void delete(String id) {
		findById(id);
		animalRepository.deleteById(id);
	}

}
