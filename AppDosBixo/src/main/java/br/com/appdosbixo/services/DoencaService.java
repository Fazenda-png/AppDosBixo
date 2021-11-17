package br.com.appdosbixo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appdosbixo.DTO.DoencaDTO;
import br.com.appdosbixo.domain.Doenca;
import br.com.appdosbixo.repository.DoencaRepository;
import br.com.appdosbixo.services.exception.ObjectNotFoundException;

@Service
public class DoencaService {

	@Autowired
	private DoencaRepository doencaRepository;
	
	public List<Doenca> findAll() {
		return doencaRepository.findAll();
	}

	public Doenca findById(String id) {
		Optional<Doenca> obj = doencaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public Doenca insert(Doenca obj) {
		return doencaRepository.insert(obj);
	}

	public Doenca FromDTO(DoencaDTO objdto) {
		return new Doenca(objdto.getId(), objdto.getSimtomas(), objdto.getRemedioAplicado(), objdto.getDataInicio());
	}

	public void delete(String id) {
		findById(id);
		doencaRepository.deleteById(id);
	}
}
