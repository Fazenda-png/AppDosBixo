package br.com.appdosbixo.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.appdosbixo.DTO.AnimalDTO;
import br.com.appdosbixo.domain.Animal;
import br.com.appdosbixo.services.AnimalServices;

@RestController
@RequestMapping(value = "/animal")
public class Resource {

	@Autowired
	private AnimalServices animalServices;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Animal>> findAll() {
		List<Animal> obj = animalServices.findAll();
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Animal> findById(@PathVariable String id) {
		Animal obj = animalServices.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Animal> findById(AnimalDTO objdto) {
		Animal obj = animalServices.FromDTO(objdto);
		obj = animalServices.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}


	// DEPOIS FAZER UPDATE E DELETE DO ANIMAL

//	@RequestMapping(value = "/{id}/cio",method = RequestMethod.GET)
//	public ResponseEntity<List<Animal>> findAll() {
//		List<Animal> obj = animalServices.findAll();
//		return ResponseEntity.ok().body(obj);
//	}
//
//	@RequestMapping(value = "/{id}/cio", method = RequestMethod.GET)
//	public ResponseEntity<Animal> findById(@PathVariable String id) {
//		Animal obj = animalServices.findById(id);
//		return ResponseEntity.ok().body(obj);
//	}
//
//	@RequestMapping(value = "/{id}/cio/add", method = RequestMethod.POST)
//	public ResponseEntity<Animal> findById(AnimalDTO objdto) {
//		Animal obj = animalServices.FromDTO(objdto);
//		obj = animalServices.insert(obj);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
//		return ResponseEntity.created(uri).build();
//	}

	// DEPOIS FAZER UPDATE E DELETE DA VACINA

//	@RequestMapping(value = "/{id}/vacina",method = RequestMethod.GET)
//	public ResponseEntity<List<Animal>> findAll() {
//		List<Animal> obj = animalServices.findAll();
//		return ResponseEntity.ok().body(obj);
//	}
//
//	@RequestMapping(value = "/{id}/vacina", method = RequestMethod.GET)
//	public ResponseEntity<Animal> findById(@PathVariable String id) {
//		Animal obj = animalServices.findById(id);
//		return ResponseEntity.ok().body(obj);
//	}
//
//	@RequestMapping(value = "/{id}/vacina/add", method = RequestMethod.POST)
//	public ResponseEntity<Animal> findById(AnimalDTO objdto) {
//		Animal obj = animalServices.FromDTO(objdto);
//		obj = animalServices.insert(obj);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
//		return ResponseEntity.created(uri).build();
//	}

	// DEPOIS FAZER UPDATE E DELETE DA VACINA

//	@RequestMapping(value = "/{id}/doenca",method = RequestMethod.GET)
//	public ResponseEntity<List<Animal>> findAll() {
//		List<Animal> obj = animalServices.findAll();
//		return ResponseEntity.ok().body(obj);
//	}
//
//	@RequestMapping(value = "/{id}/doenca", method = RequestMethod.GET)
//	public ResponseEntity<Animal> findById(@PathVariable String id) {
//		Animal obj = animalServices.findById(id);
//		return ResponseEntity.ok().body(obj);
//	}
//
//	@RequestMapping(value = "/{id}/doenca/add", method = RequestMethod.POST)
//	public ResponseEntity<Animal> findById(AnimalDTO objdto) {
//		Animal obj = animalServices.FromDTO(objdto);
//		obj = animalServices.insert(obj);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
//		return ResponseEntity.created(uri).build();
//	}

	// DEPOIS FAZER UPDATE E DELETE DA doenca
}
