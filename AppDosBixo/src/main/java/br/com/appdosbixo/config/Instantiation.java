package br.com.appdosbixo.config;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.appdosbixo.domain.Animal;
import br.com.appdosbixo.domain.enums.TipoAnimal;
import br.com.appdosbixo.repository.AnimalRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private AnimalRepository animalRepository;
	
	@Override
	public void run(String... args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		animalRepository.deleteAll();
		
		Animal a1 = new Animal(null, 24, 60.30, 366, "teste1", "holandesa", "holandesa", "Macho", TipoAnimal.Bovino);
		

		animalRepository.save(a1);

	}
	
}
